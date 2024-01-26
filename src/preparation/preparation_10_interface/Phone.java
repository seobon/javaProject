package preparation.preparation_10_interface;

public interface Phone {
    public final String CATEGORY = "phone"; // public final 생략 가능
    public abstract void sendCall(); // public abstract 생략 가능
    public abstract void receiveCall();
    public abstract void sendMessage();
    public abstract void receiveMessage();
}