package org.oop.udemyinterface.example;

public class Bird implements Animal {
    @Override
    public void breathing() {
        System.out.println("płuca");
    }

    @Override
    public void nutrition() {
        System.out.println("robaki");
    }

    @Override
    public void giveBirth() {
        System.out.println("jajo");
    }
}
