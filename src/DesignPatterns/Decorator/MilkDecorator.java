package DesignPatterns.Decorator;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Milk Added";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }
}
