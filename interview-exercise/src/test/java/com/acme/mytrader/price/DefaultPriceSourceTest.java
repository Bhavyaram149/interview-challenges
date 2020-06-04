package com.acme.mytrader.price;

import com.acme.mytrader.execution.ExecutionService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.doNothing;


@RunWith(PowerMockRunner.class)
@PrepareForTest(DefaultPriceSource.class)
public class DefaultPriceSourceTest {

    @Mock
    private ExecutionService executionService;

    @Mock
    private DefaultPriceListener priceListener;

    @InjectMocks
    private PriceSource priceSource = new DefaultPriceSource(executionService);

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void addPriceListener() throws Exception {
        doNothing().when(executionService).buy(anyString(), anyDouble(), anyInt());
        PriceSource defaultPriceSource = PowerMockito.mock(DefaultPriceSource.class);
        PowerMockito.doNothing().when(defaultPriceSource, "executeLimitOrder", anyString(), anyDouble(), anyDouble());
        defaultPriceSource.addPriceListener(priceListener);
    }


}
