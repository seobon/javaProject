package preparation.preparation_10_interface;

public class MusicEx {
    public static void main(String[] args) {
        Mp3Player mp3Player = new Mp3Player();
        CdPlayer cdPlayer = new CdPlayer();

        System.out.println("=== MP3 Player ===");
        mp3Player.play();
        mp3Player.stop();

        System.out.println("=== CD Player ===");
        cdPlayer.play();
        cdPlayer.stop();
    }
}
