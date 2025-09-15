package DesignPatterns.SimpleFactory;

public class Client {

    public static void main(String[] args) {

        Surgeon eyeSurgeon = SurgeonFactory.createSurgeon(SurgeonType.EYE_SURGEON);
        eyeSurgeon.operate();

        Surgeon neuroSurgeon = SurgeonFactory.createSurgeon(SurgeonType.NEURO_SURGEON);
        neuroSurgeon.operate();

        Surgeon faceSurgeon = SurgeonFactory.createSurgeon(SurgeonType.FACE_SURGEON);
        faceSurgeon.operate();
    }
}
