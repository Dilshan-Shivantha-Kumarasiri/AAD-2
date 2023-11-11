package lk.ijse.gdse.behavioural.observable;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new OctalObserver(subject);
        new BinaryObserver(subject);
        new HexaObserver(subject);

        subject.setState(15);
    }
}
