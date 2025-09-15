package DesignPatterns.SimpleFactory;

public class NeuroSurgeon implements Surgeon{

    @Override
    public void operate() {
        System.out.println("operating on brain");
    }
}
