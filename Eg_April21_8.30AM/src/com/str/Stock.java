package com.str;

public class Stock {
	int stockId;

	public Stock(int stockId) {
		this.stockId = stockId;
	}
	
	@Override
	public String toString() {
		return String.valueOf(stockId);
	}

}
