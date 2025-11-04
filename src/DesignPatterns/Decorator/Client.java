package DesignPatterns.Decorator;

public class Client {

    public static void main(String[] args) {
        Coffee coffee = new Cappucino();
        System.out.println("description: Name: " + coffee.getDescription() +
                " Cost: " + coffee.getCost());

        coffee = new Expresso();
        System.out.println("description: Name: " + coffee.getDescription() +
                " Cost: " + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println("description: Name: " + coffee.getDescription() +
                " Cost: " + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println("description: Name: " + coffee.getDescription() +
                " Cost: " + coffee.getCost());



    }


}
