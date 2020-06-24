package org.oop.udemyklasaabstrakcyjna.example;

public class Cat extends Mammal {
    @Override
    public void giveSound() {
        System.out.println("miałczy");
    }

    @Override
    public void displacement() {
        System.out.println("powoli przemieszcza się na 4 łapachh");
    }
}
