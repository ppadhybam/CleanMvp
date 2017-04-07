package com.priyabrat.cleanmvp.demo.stock_mocking;

import java.util.ArrayList;

/**
 * Created by PriyabratP on 06-04-2017.
 */

public class Portfolio {

    private StockService stockService;
    private ArrayList<Stock> stocksList;

    public StockService getStockService() {
        return stockService;
    }

    public void setStockService(StockService stockService) {
        this.stockService = stockService;
    }

    public ArrayList<Stock> getStocksList() {
        return stocksList;
    }

    public void setStocksList(ArrayList<Stock> stocksList) {
        this.stocksList = stocksList;
    }

    public double getMarketValue(){
        double marketValue = 0;
        for(Stock stock:stocksList)
        {
            marketValue = marketValue + (stockService.getPrice(stock) * stock.getQuantity());
        }
        return marketValue;
    }
}
