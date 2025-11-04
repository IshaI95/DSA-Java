package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Decoder.Decoder;
import DesignPatterns.AbstractFactory.Decoder.FLACDecoder;
import DesignPatterns.AbstractFactory.Processor.FLACProcessor;
import DesignPatterns.AbstractFactory.Processor.Processor;
import DesignPatterns.AbstractFactory.Renderer.FLACRenderer;
import DesignPatterns.AbstractFactory.Renderer.Renderer;

public class FLACAudioFactory implements AudioFactory{
    @Override
    public Decoder createAudioDecoder() {
        return new FLACDecoder();
    }

    @Override
    public Processor createAudioProcessor() {
        return new FLACProcessor();
    }

    @Override
    public Renderer createAudioRenderer() {
        return new FLACRenderer();
    }
}
