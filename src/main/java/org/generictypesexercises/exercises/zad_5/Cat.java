package org.generictypesexercises.exercises.zad_5;

public class Cat extends Animal {

    protected int age;

    public Cat(String origin, int age) {
        super(origin);
        this.age = age;
    }

    @Override
    public String toString() {
        return "origin " + origin + ", age " + age;
    }
}
