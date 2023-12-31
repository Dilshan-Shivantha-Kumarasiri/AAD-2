package lk.ijse.gdse.behavioural.observable;

import java.util.ArrayList;
import java.util.List;

public  class Subject {

    private int state;
    private List<Observer> observers = new ArrayList<>();

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state =state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer:observers) {
            observer.update();
        }
    }





}
