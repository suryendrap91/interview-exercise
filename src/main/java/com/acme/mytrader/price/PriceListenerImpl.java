package com.acme.mytrader.price;

import com.acme.mytrader.execution.ExecutionService;
import com.acme.mytrader.strategy.TradingStrategy;
/**
 * This class monitors the price changes and executes action based on instruction
 * @author surya
 *
 */
public class PriceListenerImpl implements PriceListener {
	
	private TradingStrategy tradingStrategy = null;
	private ExecutionService executionService = null;
	
	

	public PriceListenerImpl(TradingStrategy tradingStrategy,ExecutionService executionService) {
		this.tradingStrategy = tradingStrategy;
		this.executionService = executionService;
	}



	@Override
	public void priceUpdate(String security, double price) {			
		if(price == this.tradingStrategy.getSpecifiedPrice() && "BUY".equals(this.tradingStrategy.getInstruction())) {
			this.executionService.buy(security, price, this.tradingStrategy.getNumberOfUnits());
		}
		else if(price == this.tradingStrategy.getSpecifiedPrice() && "SELL".equals(this.tradingStrategy.getInstruction())) {
			this.executionService.sell(security, price, this.tradingStrategy.getNumberOfUnits());
		}		
	}
	
}
