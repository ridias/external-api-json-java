package infrastructure.parser;

import org.json.JSONObject;

import application.interfaces.Parser;
import domain.BookTicker;

public class BookTickerParser implements Parser<BookTicker>{

	@Override
	public BookTicker parse(JSONObject responseBody) {
		if(responseBody.isEmpty()) 
			return new BookTicker();
		
		return new BookTicker(
			responseBody.getString("symbol"),
			responseBody.getString("bidPrice"),
			responseBody.getString("bidQty"),
			responseBody.getString("askPrice"),
			responseBody.getString("askQty")
		);
	}

}
