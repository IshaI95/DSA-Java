package DesignPatterns.Observer;

public class EmailService implements Observer{

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Email Alert -> Price updated for stock "
                + stockName + " new price: " + stockPrice);
    }
}
