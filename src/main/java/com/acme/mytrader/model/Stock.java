package com.acme.mytrader.model;

/**
 * Model class to hold stock information
 * @author surya
 *
 */
public class Stock {
	
	String security;
	double price;
	int volume;
	

	public Stock(String security, double price, int volume) {
		this.security = security;
		this.price = price;
		this.volume = volume;
	}
	
	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		return "Stock [security=" + security + ", price=" + price + ", volume=" + volume + "]";
	}

	

}
