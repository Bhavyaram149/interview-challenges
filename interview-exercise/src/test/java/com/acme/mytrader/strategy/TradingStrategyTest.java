package com.acme.mytrader.strategy;

import com.acme.mytrader.price.PriceListener;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.doNothing;


public class TradingStrategyTest {

    @Mock
    private PriceListener priceListener;

    @InjectMocks
    private TradingStrategy tradingStrategy = new TradingStrategy(priceListener);


    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void limitBuyStrategy() {
        doNothing().when(priceListener).priceUpdate(anyString(), anyDouble());
        tradingStrategy.limitBuyStrategy(anyString(), anyDouble());
    }
}
