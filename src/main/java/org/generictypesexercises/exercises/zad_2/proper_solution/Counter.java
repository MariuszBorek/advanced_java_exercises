package org.generictypesexercises.exercises.zad_2.proper_solution;

public class Counter {

    public <T> int countIf(T[] array, Validator<T> validator) {
        int count = 0;
        for (T object : array) {
            if(validator.validate(object)) {
                count++;
            }
        }
        return count;
    }

}
