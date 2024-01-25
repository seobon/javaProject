package _05_class._06_prac;

public class CdPlayer implements Music {
//    private String song;
    private String album;

    public CdPlayer(String album) {
//        this.song = song;
        this.album = album;
    }

    @Override
    public void play() {
        System.out.println("CD 플레이어에서 " + album + " 앨범을 재생합니다");
    }

    @Override
    public void stop() {
        System.out.println("CD 플레이어에서 " + album + " 앨범을 정지합니다");
    }
}
