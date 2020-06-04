package com.acme.mytrader.execution;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.*;

public class DefaultExecutionServiceTest {

    @InjectMocks
    private ExecutionService defaultExecutionService = new DefaultExecutionService();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void buy() {
        defaultExecutionService.buy(anyString(), anyDouble(), anyInt());
    }

    @Test
    public void sell() {
        defaultExecutionService.sell(anyString(), anyDouble(), anyInt());
    }

}
