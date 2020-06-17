package com.acme.mytrader.execution;

import java.util.Set;

import com.acme.mytrader.model.Stock;

public interface ExecutionService {
    void buy(String security, double price, int volume);
    void sell(String security, double price, int volume);
	Set<Stock> getStockList();
}
