package com.acme.mytrader.execution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DefaultExecutionService implements ExecutionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultExecutionService.class);

    @Override
    public void buy(String security, double price, int volume) {
        LOGGER.info("bought shares TAG={} for the price={} and units={}", security, price, volume);
    }

    @Override
    public void sell(String security, double price, int volume) {
        LOGGER.info("sold shares TAG={} for the price={} and units={}", security, price, volume);
    }
}
