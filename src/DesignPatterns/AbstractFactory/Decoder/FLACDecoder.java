package DesignPatterns.AbstractFactory.Decoder;

public class FLACDecoder implements Decoder{

    @Override
    public void decode() {
        System.out.println("Decoding FLAC data");
    }
}
