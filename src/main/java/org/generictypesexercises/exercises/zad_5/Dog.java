package org.generictypesexercises.exercises.zad_5;

public class Dog extends Animal {

    protected String dogFood;

    public Dog(String origin, String dogFood) {
        super(origin);
        this.dogFood = dogFood;
    }

    @Override
    public String toString() {
        return "origin " + origin + ", dog food " + dogFood;
    }
}
