package DesignPatterns.AbstractFactory.Decoder;

public class MP3Decoder implements Decoder{
    @Override
    public void decode() {
        System.out.println("Decoding MP3 data");
    }
}
