package org.generictypesexercises.exercises.zad_2.my_solution;

public class Counter {

    private int counter;

    public int getCounter() {
        return counter;
    }

    public <T extends SomeInterface> void countIf(T[] array) {
        counter = 0;
        for (T object : array) {
            counter++;
        }
    }

    public <T> void countIfSecond(T[] array) {
        counter = 0;
        for (T object : array) {
            if(object instanceof SomeInterface) {
                counter++;
            }
        }
    }
}
