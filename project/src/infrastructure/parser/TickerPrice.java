package infrastructure.parser;

import org.json.JSONObject;

import application.interfaces.Parser;
import domain.Price;

public class TickerPrice implements Parser<Price>{

	@Override
	public Price parse(JSONObject responseBody) {
		if(responseBody.isEmpty())
			return new Price();
		
		var price = new Price();
		price.setSymbol(responseBody.getString("symbol"));
		price.setPrice(responseBody.getString("price"));
		return price;
	}

}
