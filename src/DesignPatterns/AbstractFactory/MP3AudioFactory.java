package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Decoder.Decoder;
import DesignPatterns.AbstractFactory.Decoder.MP3Decoder;
import DesignPatterns.AbstractFactory.Processor.MP3Processor;
import DesignPatterns.AbstractFactory.Processor.Processor;
import DesignPatterns.AbstractFactory.Renderer.MP3Renderer;
import DesignPatterns.AbstractFactory.Renderer.Renderer;

public class MP3AudioFactory implements AudioFactory{

    @Override
    public Decoder createAudioDecoder() {
        return new MP3Decoder();
    }

    @Override
    public Processor createAudioProcessor() {
        return new MP3Processor();
    }

    @Override
    public Renderer createAudioRenderer() {
        return new MP3Renderer();
    }
}
