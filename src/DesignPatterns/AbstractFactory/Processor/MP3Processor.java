package DesignPatterns.AbstractFactory.Processor;

public class MP3Processor implements Processor{
    @Override
    public void process() {
        System.out.println("Processing MP3 data");
    }
}
