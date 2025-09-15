package DesignPatterns.SimpleFactory;

public class FaceSurgeon implements Surgeon{

    @Override
    public void operate() {
        System.out.println("Operating on face");
    }
}
