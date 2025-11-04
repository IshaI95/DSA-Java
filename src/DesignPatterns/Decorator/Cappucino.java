package DesignPatterns.Decorator;

public class Cappucino implements Coffee{

    @Override
    public String getDescription() {
        return "Cappucino";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
