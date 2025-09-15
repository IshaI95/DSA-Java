package DesignPatterns.Strategy;

public class TimeBasedPricingStrategy implements PricingStrategy{

    @Override
    public void calculatePrice() {
        System.out.println("calculating price based on time");
    }
}
