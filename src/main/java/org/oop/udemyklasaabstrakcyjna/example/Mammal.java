package org.oop.udemyklasaabstrakcyjna.example;

public abstract class Mammal {
    public void feedingOffspring() {
        System.out.println("karmienie mlekiem");
    }

    public void temperatureOfBody() {
        System.out.println("temperatura ciała jest stał");
    }

    public void numberOfLimbs() {
        System.out.println("4 kończyny");
    }

    public abstract void giveSound();

    public abstract void displacement();
}
