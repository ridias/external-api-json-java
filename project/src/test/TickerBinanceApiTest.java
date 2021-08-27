package test;

import infrastructure.api.TickerBinanceApi;

public class TickerBinanceApiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var api = new TickerBinanceApi();
		
		var response = api.getBookTicker("BTCUSDT");
		for(int i = 0; i < response.size(); i++) {
			var bookTicker = response.get(i);
			System.out.println(bookTicker.toString());
		}
		
		TickerBinanceApiTest.sleep(1000);
		System.out.println();
		
		var response2 = api.get24hr("BTCUSDT");
		for(int i = 0; i < response2.size(); i++) {
			var ticker24hr = response2.get(i);
			System.out.println(ticker24hr.toString());
		}
		
		TickerBinanceApiTest.sleep(1000);
		System.out.println();
		
		var response3 = api.getPrice("BTCUSDT");
		for(int i = 0; i < response3.size(); i++) {
			var price = response3.get(i);
			System.out.println(price.toString());
		}
		
		TickerBinanceApiTest.sleep(1000);
		System.out.println();
		
		var response4 = api.get24hr();
		for(int i = 0; i < response4.size(); i++) {
			var ticker24hr = response4.get(i);
			System.out.println(ticker24hr.toString());
		}
		
		TickerBinanceApiTest.sleep(1000);
		System.out.println();
		
		var response5 = api.getBookTicker();
		for(int i = 0; i < response5.size(); i++) {
			var bookTicker = response5.get(i);
			System.out.println(bookTicker.toString());
		}
		
		TickerBinanceApiTest.sleep(1000);
		System.out.println();
		
		var response6 = api.getPrice();
		for(int i = 0; i < response6.size(); i++) {
			var price = response6.get(i);
			System.out.println(price.toString());
		}
		
	}
	
	public static void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		}catch(Exception ex) {
			Thread.currentThread().interrupt();
		}
		
	}

}
