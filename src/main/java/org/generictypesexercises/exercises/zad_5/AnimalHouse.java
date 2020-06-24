package org.generictypesexercises.exercises.zad_5;

import java.util.List;

public class AnimalHouse<T extends Animal> {

    List<T> animalHouse;

    public AnimalHouse(List<T> animalHouse) {
        this.animalHouse = animalHouse;
    }

    @Override
    public String toString() {
        return "Animals: " + animalHouse;
    }
}
