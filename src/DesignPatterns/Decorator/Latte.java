package DesignPatterns.Decorator;

public class Latte implements Coffee{

    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public double getCost() {
        return 30.0;
    }
}
