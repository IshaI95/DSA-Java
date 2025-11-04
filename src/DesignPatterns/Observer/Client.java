package DesignPatterns.Observer;

public class Client {

    public static void main(String[] args) {

        StockTradingManager manager = new StockTradingManager("Nippon", 90,100);

        //observers
        AppService appService = new AppService();
        EmailService emailService = new EmailService();
        SmsService smsService = new SmsService();

        manager.addObserver(appService);
        manager.addObserver(emailService);
        manager.addObserver(smsService);

        manager.updateStockPrice("Nippon", 120);
        manager.updateStockPrice("Nippon", 80);
        manager.updateStockPrice("Nippon", 180);

        manager.removeObserver(smsService);

        manager.updateStockPrice("Nippon", 280);
    }
}
