package org.generictypesexercises.exercises.zad_2.my_solution;

public class App {
    public static void main(String[] args) {
        SomeInterface object1 = new SomeInterface() {
            @Override
            public int someInterfaceMethod() {
                return 1;
            }
        };

        SomeInterface object2 = new SomeInterface() {
            @Override
            public int someInterfaceMethod() {
                return 2;
            }
        };

        SomeInterface object3 = new SomeInterface() {
            @Override
            public int someInterfaceMethod() {
                return 3;
            }
        };

        SomeInterface[] someArray = new SomeInterface[3];
        someArray[0] = object1;
        someArray[1] = object2;
        someArray[2] = object3;

        Integer[] integerArray = new Integer[3];
        integerArray[0] = 11;
        integerArray[1] = 22;
        integerArray[2] = 33;

        Counter counter = new Counter();
        counter.countIf(someArray);

        System.out.println(counter.getCounter());

    }
}
