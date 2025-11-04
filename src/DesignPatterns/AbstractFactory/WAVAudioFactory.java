package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Decoder.Decoder;
import DesignPatterns.AbstractFactory.Decoder.WAVDecoder;
import DesignPatterns.AbstractFactory.Processor.Processor;
import DesignPatterns.AbstractFactory.Processor.WAVProcessor;
import DesignPatterns.AbstractFactory.Renderer.Renderer;
import DesignPatterns.AbstractFactory.Renderer.WAVRenderer;

public class WAVAudioFactory implements AudioFactory{

    @Override
    public Decoder createAudioDecoder() {
        return new WAVDecoder();
    }

    @Override
    public Processor createAudioProcessor() {
        return new WAVProcessor();
    }

    @Override
    public Renderer createAudioRenderer() {
        return new WAVRenderer();
    }
}
