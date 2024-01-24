package _05_class._06_prac;

import _05_class._06_interface.Audio;
import _05_class._06_interface.Television;

public class MusicPlayer {
    public static void main(String[] args) {
        Mp3Player mp3Player = new Mp3Player("우주소녀 이루리");
        System.out.println("=== Mp3 Player ===");
        mp3Player.play();
        mp3Player.stop();

        CdPlayer cdPlayer = new CdPlayer("우주소녀 As You Wish");
        System.out.println("=== CD Player ===");
        cdPlayer.play();
        cdPlayer.stop();
    }
}
