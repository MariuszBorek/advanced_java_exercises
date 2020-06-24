package org.oop.udemyinterface.example;

public class Fish implements Animal {
    @Override
    public void breathing() {
        System.out.println("skrzela");
    }

    @Override
    public void nutrition() {
        System.out.println("robaki");
    }

    @Override
    public void giveBirth() {
        System.out.println("ikra");
    }
}
