package infrastructure.api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import application.interfaces.Parser;
import application.interfaces.TickerBinance;
import domain.BookTicker;
import domain.Price;
import domain.Ticker24hr;
import infrastructure.parser.BookTickerParser;
import infrastructure.parser.Ticker24hrParser;
import infrastructure.parser.TickerPrice;

public class TickerBinanceApi implements TickerBinance {

	private static String urlBinance = "https://api.binance.com/api/v3";
	private Parser<?> parser;
	
	public TickerBinanceApi() {
		this.parser = null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<BookTicker> getBookTicker() {
		var result = new ArrayList<BookTicker>();
		this.parser = new BookTickerParser();
		result = (ArrayList<BookTicker>) this.GetBookTickerArrays(result, "/ticker/bookTicker", this.parser);
		return result;
	}

	@Override
	public ArrayList<BookTicker> getBookTicker(String symbol) {
		var result = new ArrayList<BookTicker>();
		this.parser = new BookTickerParser();
		result = this.GetBookTicker(result, "/ticker/bookTicker?symbol=" + symbol, this.parser);
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Ticker24hr> get24hr() {
		var result = new ArrayList<Ticker24hr>();
		this.parser = new Ticker24hrParser();
		result = (ArrayList<Ticker24hr>) this.GetBookTickerArrays(result, "/ticker/24hr", this.parser);
		return result;
	}

	@Override
	public ArrayList<Ticker24hr> get24hr(String symbol) {
		var result = new ArrayList<Ticker24hr>();
		this.parser = new Ticker24hrParser();
		result = this.GetBookTicker(result, "/ticker/24hr?symbol=" + symbol, this.parser);
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Price> getPrice() {
		var result = new ArrayList<Price>();
		this.parser = new TickerPrice();
		result = (ArrayList<Price>) this.GetBookTickerArrays(result, "/ticker/price", this.parser);
		return result;
	}

	@Override
	public ArrayList<Price> getPrice(String symbol) {
		var result = new ArrayList<Price>();
		this.parser = new TickerPrice();
		result = this.GetBookTicker(result, "/ticker/price?symbol=" + symbol, this.parser);
		return result;
	}
	
	@SuppressWarnings("unchecked")
	private <T> ArrayList<?> GetBookTickerArrays(ArrayList<T> result, String url, Parser<?> parser){
		result = new ArrayList<T>();
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
			.uri(URI.create(urlBinance + url))
			.GET()
			.header("Accept", "application/json")
			.build();
		
		try {
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			if(response.statusCode() == 200) {
				JSONArray arr = new JSONArray(response.body());
				for(int i = 0; i < arr.length(); i++) {
					JSONObject obj = arr.getJSONObject(i);
					var objParsed = parser.parse(obj);
					result.add((T) objParsed);
				}
			}
		}catch(Exception ex) {
			System.out.println("Something is wrong: " + ex.getMessage());
		}
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	private <T> ArrayList<T> GetBookTicker(ArrayList<T> result, String url, Parser<?> parser) {
		result = new ArrayList<T>();
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
			.uri(URI.create(urlBinance + url))
			.GET()
			.header("Accept", "application/json")
			.build();
		
		try {
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			if(response.statusCode() == 200) {
				result.add((T)this.parser.parse(new JSONObject(response.body())));
			}
		}catch(Exception ex) {
			System.out.println("Something is wrong: " + ex.getMessage());
		}
		
		return result;
		
	}

}
