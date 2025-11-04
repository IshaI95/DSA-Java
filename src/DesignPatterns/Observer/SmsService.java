package DesignPatterns.Observer;

public class SmsService implements Observer{

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Sms Alert -> Price updated for stock "
                + stockName + " new price: " + stockPrice);
    }
}
