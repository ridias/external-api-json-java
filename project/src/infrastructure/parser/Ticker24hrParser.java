package infrastructure.parser;

import org.json.JSONObject;

import application.interfaces.Parser;
import domain.Ticker24hr;

public class Ticker24hrParser implements Parser<Ticker24hr> {

	@Override
	public Ticker24hr parse(JSONObject responseBody) {
		if(responseBody.isEmpty()) 
			return new Ticker24hr();
		
		var ticker = new Ticker24hr();
		ticker.setSymbol(responseBody.getString("symbol"));
		ticker.setPriceChange(responseBody.getString("priceChange"));
		ticker.setPriceChangePercent(responseBody.getString("priceChangePercent"));
		ticker.setWeightedAvgPrice(responseBody.getString("weightedAvgPrice"));
		ticker.setPrevClosePrice(responseBody.getString("prevClosePrice"));
		ticker.setLastPrice(responseBody.getString("lastPrice"));
		ticker.setLastQty(responseBody.getString("lastQty"));
		ticker.setBidPrice(responseBody.getString("bidPrice"));
		ticker.setAskPrice(responseBody.getString("askPrice"));
		ticker.setOpenPrice(responseBody.getString("openPrice"));
		ticker.setHighPrice(responseBody.getString("highPrice"));
		ticker.setLowPrice(responseBody.getString("lowPrice"));
		ticker.setVolume(responseBody.getString("volume"));
		ticker.setQuoteVolume(responseBody.getString("quoteVolume"));
		ticker.setOpenTime(responseBody.getDouble("openTime"));
		ticker.setCloseTime(responseBody.getDouble("closeTime"));
		ticker.setFirstId(responseBody.getDouble("firstId"));
		ticker.setLastId(responseBody.getDouble("lastId"));
		ticker.setCount(responseBody.getInt("count"));
		return ticker;
	}

}
