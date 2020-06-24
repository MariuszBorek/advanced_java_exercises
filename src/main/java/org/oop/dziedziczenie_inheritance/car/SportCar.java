package org.oop.dziedziczenie_inheritance.car;

public class SportCar extends Car { // klasa SportCar dziedziczy po klasie Car

    public void drive() {
        turnOnEngine();
        System.out.println("I'm driving!");
    }
}