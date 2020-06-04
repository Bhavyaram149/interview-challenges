package com.acme.mytrader;

import com.acme.mytrader.price.DefaultPriceListener;
import com.acme.mytrader.price.PriceListener;
import com.acme.mytrader.strategy.TradingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootStrapApp implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(BootStrapApp.class);

    @Autowired
    private TradingStrategy tradingStrategy;

    public static void main(String... args) throws Exception {
        SpringApplication.run(BootStrapApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Trading Started");
        if (args.length > 1)
            tradingStrategy.limitBuyStrategy(args[0], Double.parseDouble(args[1]));
        else
            tradingStrategy.limitBuyStrategy("IBM", 100.0);

    }
}
