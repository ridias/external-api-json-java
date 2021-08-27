package domain;

public class Price extends BaseTicker {

	private String price;
	
	public Price() {
		super();
	}
	
	public Price(String symbol, String price) {
		super(symbol);
		this.price = price;
	}
	
	public void setPrice(String price) { this.price = price; }
	public String getPrice() { return this.price; }
	
	public String toString() {
		return this.getSymbol() + " ; " + this.price;
	}
}
