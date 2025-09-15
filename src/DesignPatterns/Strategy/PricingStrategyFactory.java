package DesignPatterns.Strategy;

public class PricingStrategyFactory {

    public static PricingStrategy getPricingStrategy(PricingType type) {

        PricingStrategy strategy = null;

        if(type.equals(PricingType.DISTANCE)) {
            strategy = new DistanceBasedPricingStrategy();
        } else if(type.equals(PricingType.TIME)) {
            strategy = new TimeBasedPricingStrategy();
        } else if(type.equals(PricingType.SURGE)) {
            strategy = new SurgeBasedPricingStrategy();
        }

        return strategy;
    }
}
