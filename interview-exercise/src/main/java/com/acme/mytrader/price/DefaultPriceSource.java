package com.acme.mytrader.price;

import com.acme.mytrader.execution.ExecutionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class DefaultPriceSource implements PriceSource {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultPriceSource.class);

    private ExecutionService executionService;

    @Autowired
    public DefaultPriceSource(ExecutionService executionService) {
        this.executionService = executionService;
    }

    /**
     * Dummy price data-source
     */
    private Map<String, Double> priceDataSource = new HashMap<>();


    /**
     * Listeners Set
     */
    private static Set<PriceListener> priceListeners = new HashSet<>();

    {
        priceDataSource.put("AAPL", 310.0);
        priceDataSource.put("IBM", 100.0);
        priceDataSource.put("GOOGL", 789.0);
    }


    @Override
    public void addPriceListener(PriceListener listener) {
        priceListeners.add(listener);
        DefaultPriceListener defaultPriceListener = (DefaultPriceListener) listener;
        executeLimitOrder(defaultPriceListener.getSecurity(), defaultPriceListener.getPrice(), priceDataSource.get(defaultPriceListener.getSecurity()));
    }

    private void executeLimitOrder(String security, Double expectedSharePrice, Double actualShareValue) {
        LOGGER.info("==> executeLimitOrder security={} expectedSharePrice={} actualShareValue={}", security, expectedSharePrice, actualShareValue);
        //continuously monitor the share value until the expected expectedSharePrice reached
        while (true) {
            if (Double.compare(expectedSharePrice, actualShareValue) == 0) {
                //Met the expected price execute buy
                executionService.buy(security, expectedSharePrice, 100);//dummy 100 units
                break;
            }
            //dummy trending decreasing the value of share
            actualShareValue = actualShareValue - Math.random() * 10;
        }
    }


    @Override
    public void removePriceListener(PriceListener listener) {
        priceListeners.remove(listener);
    }

}
