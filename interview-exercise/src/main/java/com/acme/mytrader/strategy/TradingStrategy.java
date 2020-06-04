package com.acme.mytrader.strategy;

import com.acme.mytrader.price.PriceListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 */

@Component
public class TradingStrategy {

    private PriceListener priceListener;

    @Autowired
    public TradingStrategy(PriceListener priceListener) {
        this.priceListener = priceListener;
    }


    public void limitBuyStrategy(String tagName, double price) {
        priceListener.priceUpdate(tagName, price);
    }
}
