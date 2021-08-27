package domain;

public class Ticker24hr extends BaseTicker {
	private String priceChange;
	private String priceChangePercent;
	private String weightedAvgPrice;
	private String prevClosePrice;
	private String lastPrice;
	private String lastQty;
	private String bidPrice;
	private String askPrice;
	private String openPrice;
	private String highPrice;
	private String lowPrice;
	private String volume;
	private String quoteVolume;
	private double openTime;
	private double closeTime;
	private double firstId;
	private double lastId;
	private int count;
	
	public Ticker24hr() {
		super();
	}
	
	public String getPriceChange() {
		return priceChange;
	}
	
	public void setPriceChange(String priceChange) {
		this.priceChange = priceChange;
	}
	
	public String getPriceChangePercent() {
		return priceChangePercent;
	}
	
	public void setPriceChangePercent(String priceChangePercent) {
		this.priceChangePercent = priceChangePercent;
	}
	
	public String getWeightedAvgPrice() {
		return weightedAvgPrice;
	}
	
	public void setWeightedAvgPrice(String weightedAvgPrice) {
		this.weightedAvgPrice = weightedAvgPrice;
	}
	
	public String getPrevClosePrice() {
		return prevClosePrice;
	}
	
	public void setPrevClosePrice(String prevClosePrice) {
		this.prevClosePrice = prevClosePrice;
	}
	
	public String getLastPrice() {
		return lastPrice;
	}
	
	public void setLastPrice(String lastPrice) {
		this.lastPrice = lastPrice;
	}
	
	public String getLastQty() {
		return lastQty;
	}
	
	public void setLastQty(String lastQty) {
		this.lastQty = lastQty;
	}
	
	public String getBidPrice() {
		return bidPrice;
	}
	
	public void setBidPrice(String bidPrice) {
		this.bidPrice = bidPrice;
	}
	
	public String getAskPrice() {
		return askPrice;
	}
	
	public void setAskPrice(String askPrice) {
		this.askPrice = askPrice;
	}
	
	public String getOpenPrice() {
		return openPrice;
	}
	
	public void setOpenPrice(String openPrice) {
		this.openPrice = openPrice;
	}
	
	public String getHighPrice() {
		return highPrice;
	}
	
	public void setHighPrice(String highPrice) {
		this.highPrice = highPrice;
	}
	
	public String getLowPrice() {
		return lowPrice;
	}
	
	public void setLowPrice(String lowPrice) {
		this.lowPrice = lowPrice;
	}
	
	public String getVolume() {
		return volume;
	}
	
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	public String getQuoteVolume() {
		return quoteVolume;
	}
	
	public void setQuoteVolume(String quoteVolume) {
		this.quoteVolume = quoteVolume;
	}
	
	public double getOpenTime() {
		return openTime;
	}
	
	public void setOpenTime(double openTime) {
		this.openTime = openTime;
	}
	
	public double getCloseTime() {
		return closeTime;
	}
	
	public void setCloseTime(double closeTime) {
		this.closeTime = closeTime;
	}
	
	public double getFirstId() {
		return firstId;
	}
	
	public void setFirstId(double firstId) {
		this.firstId = firstId;
	}
	
	public double getLastId() {
		return lastId;
	}
	
	public void setLastId(double lastId) {
		this.lastId = lastId;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Ticker24hr [symbol=" + this.getSymbol() + ", priceChange=" + priceChange + ", priceChangePercent=" + priceChangePercent
				+ ", weightedAvgPrice=" + weightedAvgPrice + ", prevClosePrice=" + prevClosePrice + ", lastPrice="
				+ lastPrice + ", lastQty=" + lastQty + ", bidPrice=" + bidPrice + ", askPrice=" + askPrice
				+ ", openPrice=" + openPrice + ", highPrice=" + highPrice + ", lowPrice=" + lowPrice + ", volume="
				+ volume + ", quoteVolume=" + quoteVolume + ", openTime=" + openTime + ", closeTime=" + closeTime
				+ ", firstId=" + firstId + ", lastId=" + lastId + ", count=" + count + "]";
	}
	
}
