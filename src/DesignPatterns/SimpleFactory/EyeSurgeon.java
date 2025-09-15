package DesignPatterns.SimpleFactory;

public class EyeSurgeon implements Surgeon{

    @Override
    public void operate() {
        System.out.println("Operating on eyes");
    }
}
