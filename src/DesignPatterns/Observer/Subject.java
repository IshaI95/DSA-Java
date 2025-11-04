package DesignPatterns.Observer;

public interface Subject {

    public void addObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers(String stockName, double stockPrice);
}
