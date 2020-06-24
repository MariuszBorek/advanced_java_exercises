package org.generictypesexercises.exercises.zad_2.proper_solution;

public class App {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Integer[] integerArray = {10, 20, 50, 60, 10, 10, 30, 10, 10, 20, 30, 10};

        int count = counter.countIf(integerArray, new Validator<Integer>() {
            @Override
            public boolean validate(Integer value) {
                    return value == 10;
            }
        });
        System.out.println(count);
    }
}
