package application.interfaces;

import java.util.ArrayList;

import domain.BookTicker;
import domain.Price;
import domain.Ticker24hr;

public interface TickerBinance {

	public ArrayList<BookTicker> getBookTicker();
	public ArrayList<BookTicker> getBookTicker(String symbol);
	public ArrayList<Ticker24hr> get24hr();
	public ArrayList<Ticker24hr> get24hr(String symbol);
	public ArrayList<Price> getPrice();
	public ArrayList<Price> getPrice(String symbol);
}
