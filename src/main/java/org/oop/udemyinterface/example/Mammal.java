package org.oop.udemyinterface.example;

public class Mammal implements Animal{
    @Override
    public void breathing() {
        System.out.println("płuca");
    }

    @Override
    public void nutrition() {
        System.out.println("mięso, rośliny");
    }

    @Override
    public void giveBirth() {
        System.out.println("płód");
    }
}
