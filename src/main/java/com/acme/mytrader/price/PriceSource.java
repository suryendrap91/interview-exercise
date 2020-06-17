package com.acme.mytrader.price;

import com.acme.mytrader.model.Stock;

public interface PriceSource {
    void addPriceListener(PriceListener listener);
    void removePriceListener(PriceListener listener);
	void updatePrice(Stock stock);
}
