package org.oop.udemyinterface.example;

public class App {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Bird bird = new Bird();
        Mammal mammal = new Mammal();

        System.out.println("fish");
        fish.breathing();
        fish.nutrition();
        fish.giveBirth();

        System.out.println("\nbird");
        bird.breathing();
        bird.nutrition();
        bird.giveBirth();

        System.out.println("\nmammal");
        mammal.breathing();
        mammal.nutrition();
        mammal.giveBirth();


    }
}
