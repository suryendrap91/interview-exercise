package com.acme.mytrader.price;

import com.acme.mytrader.model.Stock;
/**
 * This class monitors the price changes and calls Listener
 * @author surya
 *
 */
public class PriceSourceImpl implements PriceSource {

	private PriceListener priceListener = null;

	@Override
	public void addPriceListener(PriceListener listener) {
		this.priceListener = listener;
	}

	@Override
	public void removePriceListener(PriceListener listener) {
		this.priceListener = null;
	}
    /**
     * Updating price of stock and calls listener for price updates
     * @param stock
     */
	@Override
	public void updatePrice(Stock stock) {
		this.priceListener.priceUpdate(stock.getSecurity(), stock.getPrice());
	}

}
