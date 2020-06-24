package org.oop.udemyklasaabstrakcyjna.example;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Horse horse = new Horse();

        System.out.println("dog:");
        dog.displacement();
        dog.giveSound();
        dog.feedingOffspring();
        dog.numberOfLimbs();
        dog.temperatureOfBody();

        System.out.println("\ncat:");
        cat.displacement();
        cat.giveSound();
        cat.feedingOffspring();
        cat.numberOfLimbs();
        cat.temperatureOfBody();

        System.out.println("\nhorse:");
        horse.displacement();
        horse.giveSound();
        horse.feedingOffspring();
        horse.numberOfLimbs();
        horse.temperatureOfBody();
    }
}
