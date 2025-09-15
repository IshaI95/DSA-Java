package DesignPatterns.Strategy;

public class Client {

    public static void main(String[] args) {

        PricingManager pricingManager = new PricingManager(null);

        pricingManager.managePriceCalculation(PricingType.DISTANCE);
        pricingManager.managePriceCalculation(PricingType.SURGE);
        pricingManager.managePriceCalculation(PricingType.TIME);
    }
}
