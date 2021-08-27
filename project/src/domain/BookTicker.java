package domain;

public class BookTicker extends BaseTicker {

	private String bidPrice;
	private String bidQty;
	private String askPrice;
	private String askQty;
	
	public BookTicker() {
		super("");
		this.bidPrice = "";
		this.bidQty = "";
		this.askPrice = "";
		this.askQty = "";
	}
	
	public BookTicker(String symbol, String bidPrice, String bidQty, String askPrice, String askQty) {
		super(symbol);
		this.bidPrice = bidPrice;
		this.bidQty = bidQty;
		this.askPrice = askPrice;
		this.askQty = askQty;
	}
	
	public String getBidPrice() { return this.bidPrice; }
	public String getBidQty() { return this.bidQty;}
	public String getAskPrice() { return this.askPrice; }
	public String getAskQty() { return this.askQty; }
	
	public void setBidPrice(String bidPrice) { this.bidPrice = bidPrice; }
	public void setBidQty(String bidQty) { this.bidQty = bidQty; }
	public void setAskPrice(String askPrice) { this.askPrice = askPrice; }
	public void setAskQty(String askQty) { this.askQty = askQty; }
	
	public String toString() {
		return this.getSymbol() + " ; " + this.askPrice + " ; " + this.askQty + " ; " + this.bidPrice + " ; " + this.bidQty;
	}
}
