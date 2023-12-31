package lk.ijse.gdse.behavioural.observable;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("octal value : "+Integer.toOctalString(subject.getState()));
    }
}
