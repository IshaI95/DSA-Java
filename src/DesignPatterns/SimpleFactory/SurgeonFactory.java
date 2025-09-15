package DesignPatterns.SimpleFactory;

public class SurgeonFactory {

    public static Surgeon createSurgeon(SurgeonType type) {

        if(type.equals(SurgeonType.EYE_SURGEON)) {
            return new EyeSurgeon();
        } else if (type.equals(SurgeonType.NEURO_SURGEON)) {
            return new NeuroSurgeon();
        } else {
            return new FaceSurgeon();
        }
    }
}
