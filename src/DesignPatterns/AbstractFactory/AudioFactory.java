package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Decoder.Decoder;
import DesignPatterns.AbstractFactory.Processor.Processor;
import DesignPatterns.AbstractFactory.Renderer.Renderer;

public interface AudioFactory {

    public Decoder createAudioDecoder();
    public Processor createAudioProcessor();
    public Renderer createAudioRenderer();

}
