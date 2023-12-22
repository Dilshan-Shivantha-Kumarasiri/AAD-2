package org.example.creational.singleton_design_pattern;


public class SingletonDemo {
    public static void main(String[] args) {

        //SingletonObject object1=new SingletonObject();

        SingletonObject object2= SingletonObject.getInstance();
        object2.showMessage();
    }
}
