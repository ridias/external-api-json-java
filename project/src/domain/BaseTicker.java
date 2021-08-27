package domain;

public abstract class BaseTicker {
	
	private String symbol;
	
	public BaseTicker() {
		this.symbol = "";
	}
	
	public BaseTicker(String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol() { return this.symbol; }
	
	public void setSymbol(String symbol) { this.symbol = symbol; }
}
