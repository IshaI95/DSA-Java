package DesignPatterns.Strategy;

public class PricingManager {

    PricingStrategy pricingStrategy;

    public PricingManager(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void managePriceCalculation(PricingType type) {
        PricingStrategyFactory.getPricingStrategy(type).calculatePrice();

    }
}
