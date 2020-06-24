package org.generictypesexercises.exercises.zad_5;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Animal> animals = List.of(new Cat("Persian", 2),
                new Dog("France", "meet"),
                new Dog("Poland", "fish"),
                new Cat("German", 6),
                new Cat("Kirgistan", 28));

        AnimalHouse<Animal> animalsList = new AnimalHouse<>(animals);
        System.out.println(animalsList.toString());


    }
}
