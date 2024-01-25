package _05_class._06_interface;

public class Television implements RemoteControl {
    // 필드
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Television 를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Television 를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        // 인터페이스의 상수 필드를 이용해서 volume 필드의 값 제한
        if (volume > RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Television의 볼륨 : " + this.volume);
    }
}
