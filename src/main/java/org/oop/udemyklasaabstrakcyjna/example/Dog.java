package org.oop.udemyklasaabstrakcyjna.example;

public class Dog extends Mammal {
    @Override
    public void giveSound() {
        System.out.println("szczekanie");
    }

    @Override
    public void displacement() {
        System.out.println("biega na 4 łapach");
    }
}
