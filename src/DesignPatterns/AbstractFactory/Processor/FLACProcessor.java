package DesignPatterns.AbstractFactory.Processor;

public class FLACProcessor implements Processor{
    @Override
    public void process() {
        System.out.println("Processing FLAC data");
    }
}
