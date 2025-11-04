package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockTradingManager implements Subject{

    private List<Observer> observerList = new ArrayList<>();
    private String stockName;
    private double stockPrice;
    private double threshold;

    public StockTradingManager(String stockName, double stockPrice, double threshold) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.threshold = threshold;
    }

    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    public void updateStockPrice(String stockName, double stockPrice) {
        double currentPrice = stockPrice;
        if (currentPrice > threshold) {
            notifyObservers(stockName, stockPrice);
        }
    }

    @Override
    public void notifyObservers(String stockName, double stockPrice) {
            observerList.forEach(observer -> observer.update(stockName,stockPrice));
    }
}
