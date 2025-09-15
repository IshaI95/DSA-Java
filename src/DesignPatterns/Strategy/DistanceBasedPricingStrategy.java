package DesignPatterns.Strategy;

public class DistanceBasedPricingStrategy implements PricingStrategy{
    @Override
    public void calculatePrice() {
        System.out.println("Calculating Price based on distance");
    }
}
