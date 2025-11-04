package DesignPatterns.Observer;

public class AppService implements Observer{

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("App Alert -> Price updated for stock "
                + stockName + " new price: " + stockPrice);
    }
}
