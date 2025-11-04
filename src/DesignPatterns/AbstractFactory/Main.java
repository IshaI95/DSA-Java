package DesignPatterns.AbstractFactory;

public class Main {

    public static void main(String[] args) {

        AudioFactory mp3 = new MP3AudioFactory();
        AudioPlayer player = new AudioPlayer(mp3);
        player.play();

        AudioFactory wav = new WAVAudioFactory();
        AudioPlayer player1 = new AudioPlayer(wav);
        player1.play();

        AudioFactory flac = new FLACAudioFactory();
        AudioPlayer player2 = new AudioPlayer(flac);
        player2.play();
    }
}
