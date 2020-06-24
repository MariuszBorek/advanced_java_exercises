package org.generictypesexercises.exercises.zad_2.proper_solution;


public interface Validator<T> {

    boolean validate(T value);
}
