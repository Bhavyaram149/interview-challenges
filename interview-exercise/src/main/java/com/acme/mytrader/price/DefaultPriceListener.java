package com.acme.mytrader.price;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultPriceListener implements PriceListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultPriceListener.class);

    private String security;

    private double price;

    private PriceSource priceSource;

    @Autowired
    public DefaultPriceListener(PriceSource priceSource) {
        super();
        this.priceSource = priceSource;
    }


    @Override
    public void priceUpdate(String security, double price) {
        LOGGER.info("priceUpdate security={},price={}", security, price);
        this.security = security;
        this.price = price;
        priceSource.addPriceListener(this);
    }

    public String getSecurity() {
        return security;
    }


    public double getPrice() {
        return price;
    }
}
