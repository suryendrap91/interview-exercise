package com.acme.mytrader.strategy;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 */
public class TradingStrategy {

	String stockName;
	String instruction;
	double specifiedPrice;
	int numberOfUnits;

	public TradingStrategy(String stockName, double specifiedPrice, int numberOfUnits, String instruction) {
		this.stockName = stockName;
		this.specifiedPrice = specifiedPrice;
		this.numberOfUnits = numberOfUnits;
		this.instruction = instruction;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public double getSpecifiedPrice() {
		return specifiedPrice;
	}

	public void setSpecifiedPrice(double specifiedPrice) {
		this.specifiedPrice = specifiedPrice;
	}

	public int getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(int numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	@Override
	public String toString() {
		return "TradingStrategy [stockName=" + stockName + ", specifiedPrice=" + specifiedPrice + ", numberOfUnits="
				+ numberOfUnits + "]";
	}

}
