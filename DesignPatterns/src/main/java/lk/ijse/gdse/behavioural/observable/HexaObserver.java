package lk.ijse.gdse.behavioural.observable;

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa value : "+Integer.toHexString(subject.getState()));
    }
}
