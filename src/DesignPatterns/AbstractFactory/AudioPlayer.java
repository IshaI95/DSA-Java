package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Decoder.Decoder;
import DesignPatterns.AbstractFactory.Processor.Processor;
import DesignPatterns.AbstractFactory.Renderer.Renderer;

public class AudioPlayer {

    private Decoder decoder;
    private Processor processor;
    private Renderer renderer;

    public AudioPlayer(AudioFactory factory) {
        this.decoder = factory.createAudioDecoder();
        this.processor = factory.createAudioProcessor();
        this.renderer = factory.createAudioRenderer();
    }

    public void play() {
        decoder.decode();
        processor.process();
        renderer.render();
    }
}
