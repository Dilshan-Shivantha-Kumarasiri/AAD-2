package lk.ijse.gdse.behavioural.observable;

import java.util.ArrayList;
import java.util.List;

public abstract class Observer {

    protected Subject subject;
    private List <Observer> list = new ArrayList<>();

    public abstract void update();
}
