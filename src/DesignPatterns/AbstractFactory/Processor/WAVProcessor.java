package DesignPatterns.AbstractFactory.Processor;

public class WAVProcessor implements Processor{
    @Override
    public void process() {
        System.out.println("Processing WAV data");
    }
}
