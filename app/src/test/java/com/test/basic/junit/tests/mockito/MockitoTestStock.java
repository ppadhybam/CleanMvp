package com.test.basic.junit.tests.mockito;


import com.priyabrat.cleanmvp.demo.stock_mocking.Portfolio;
import com.priyabrat.cleanmvp.demo.stock_mocking.Stock;
import com.priyabrat.cleanmvp.demo.stock_mocking.StockService;

import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;

/**
 * Created by PriyabratP on 06-04-2017.
 */

public class MockitoTestStock {

    private StockService stockService;
    private Portfolio portfolio;


    public void init(){
        portfolio = new Portfolio();
        stockService = mock(StockService.class);
        portfolio.setStockService(stockService);
    }

    public boolean testMarketValue(){
        ArrayList<Stock> stocksList = new ArrayList<Stock>();
        Stock stock1 = new Stock("1","Google",10);
        stocksList.add(stock1);
        Stock stock2 = new Stock("2","MS",100);
        stocksList.add(stock2);

        portfolio.setStocksList(stocksList);

        // Write Mockito code
        //mock the behavior of stock service to return the value of various stocks
        /*when(stockService.getPrice(stock1)).thenReturn(50.00);
        when(stockService.getPrice(stock2)).thenReturn(1000.00);*/

        return portfolio.getMarketValue() == 100500.0;
    }

    @Test
    public void testStockMarketValue(){
        init();
        System.out.println(testMarketValue()?"pass":"fail");
    }
}
