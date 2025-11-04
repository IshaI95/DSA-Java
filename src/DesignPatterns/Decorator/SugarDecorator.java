package DesignPatterns.Decorator;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Sugar Added";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.0;
    }
}
