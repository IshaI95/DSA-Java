package DesignPatterns.AbstractFactory.Renderer;

public class WAVRenderer implements Renderer{

    @Override
    public void render() {
        System.out.println("Rendering WAV data");
    }
}
