package DesignPatterns.AbstractFactory.Renderer;

public class FLACRenderer implements Renderer{
    @Override
    public void render() {
        System.out.println("Rendering FLAC data");
    }
}
