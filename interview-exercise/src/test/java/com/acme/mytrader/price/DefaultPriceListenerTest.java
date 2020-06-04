package com.acme.mytrader.price;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.doNothing;

public class DefaultPriceListenerTest {

    @Mock
    private PriceSource priceSource;

    @InjectMocks
    private DefaultPriceListener defaultPriceListener = new DefaultPriceListener(priceSource);

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void priceUpdate() {
        doNothing().when(priceSource).addPriceListener(defaultPriceListener);
        defaultPriceListener.priceUpdate(Mockito.anyString(), 100.0);
    }

}
