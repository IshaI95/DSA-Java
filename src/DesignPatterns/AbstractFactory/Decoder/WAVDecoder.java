package DesignPatterns.AbstractFactory.Decoder;

public class WAVDecoder implements Decoder{

    @Override
    public void decode() {
        System.out.println("Decoding WAV data");
    }
}
