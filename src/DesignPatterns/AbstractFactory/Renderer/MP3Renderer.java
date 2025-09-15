package DesignPatterns.AbstractFactory.Renderer;

public class MP3Renderer implements Renderer{

    @Override
    public void render() {
        System.out.println("Rendering MP3 data");
    }
}
