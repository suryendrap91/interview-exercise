package com.acme.mytrader.strategy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

import org.junit.BeforeClass;
import org.junit.Test;

import com.acme.mytrader.execution.ExecutionService;
import com.acme.mytrader.execution.ExecutionServiceImpl;
import com.acme.mytrader.model.Stock;
import com.acme.mytrader.price.PriceListener;
import com.acme.mytrader.price.PriceListenerImpl;
import com.acme.mytrader.price.PriceSource;
import com.acme.mytrader.price.PriceSourceImpl;

public class TradingStrategyTest {

	static ExecutionService executionService = null;
	static PriceSource priceSource = null;
	static PriceListener priceListener = null;

	@BeforeClass
	public static void initialize() {
		executionService = new ExecutionServiceImpl();
		priceSource = new PriceSourceImpl();
	}

	@Test
	public void testNotMatchPrice() {
		TradingStrategy tradingStrategy = new TradingStrategy("IBM", 86, 100, "BUY");
		priceListener = new PriceListenerImpl(tradingStrategy, executionService);
		priceSource.addPriceListener(priceListener);
		priceSource.updatePrice(new Stock("IBM", 56, 1));
		assertThat(executionService.getStockList(), hasSize(0));

	}

	@Test
	public void testMatchPrice() {
		TradingStrategy tradingStrategy = new TradingStrategy("IBM", 86, 100, "BUY");
		priceListener = new PriceListenerImpl(tradingStrategy, executionService);
		priceSource.addPriceListener(priceListener);
		priceSource.updatePrice(new Stock("IBM", 86, 1));
		assertThat(executionService.getStockList(), hasSize(1));
	}
}
