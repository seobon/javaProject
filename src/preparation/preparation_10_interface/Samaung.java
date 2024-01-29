package preparation.preparation_10_interface;

public class Samaung implements Phone{
    public boolean silence = false;

    @Override // 부모 클래스에 있는 메서드를 Override 했다는 것을 명시적으로 선언 (주석과 비슷)
    public void sendCall() {
        if (!silence) System.out.println("전화를 연결하고 있습니다.");
    }

    @Override
    public void receiveCall() {
        if (!silence) System.out.println("전화 왔습니다.");
    }

    @Override
    public void sendMessage() {
        if (!silence) System.out.println("메세지를 전송하고 있습니다.");
    }

    @Override
    public void receiveMessage() {
        if (!silence) System.out.println("메세지가 도착했습니다.");
    }
}
