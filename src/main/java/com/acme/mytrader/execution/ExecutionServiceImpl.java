package com.acme.mytrader.execution;

import java.util.HashSet;
import java.util.Set;

import com.acme.mytrader.model.Stock;

public class ExecutionServiceImpl implements ExecutionService {

	Set<Stock> stockList = new HashSet<>();

	/**
	 * Updates stocks
	 */
	@Override
	public void buy(String security, double price, int volume) {
		boolean isStockExists = false;
		for (Stock stock : this.stockList) {
			if (stock.getSecurity().equals(security)) {
				stock.setVolume(stock.getVolume() + volume);
				isStockExists = true;
			}
		}
		if (!isStockExists) {
			stockList.add(new Stock(security, price, volume));
		}
	}

	/**
	 * Updates stocks
	 */
	@Override
	public void sell(String security, double price, int volume) {
		for (Stock stock : this.stockList) {
			if (stock.getSecurity().equals(security)) {
				stock.setVolume(stock.getVolume() - volume);
			}
		}
	}

	@Override
	public Set<Stock> getStockList() {
		return stockList;
	}

	public void setStockList(Set<Stock> stockList) {
		this.stockList = stockList;
	}

}
