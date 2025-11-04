package DesignPatterns.Decorator;

public class Expresso implements Coffee{
    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public double getCost() {
        return 20.0;
    }
}
