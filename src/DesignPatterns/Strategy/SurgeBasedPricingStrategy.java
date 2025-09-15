package DesignPatterns.Strategy;

public class SurgeBasedPricingStrategy implements PricingStrategy{

    @Override
    public void calculatePrice() {
        System.out.println("calculating price based on surge");
    }
}
