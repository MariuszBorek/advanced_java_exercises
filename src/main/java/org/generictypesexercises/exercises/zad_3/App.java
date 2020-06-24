package org.generictypesexercises.exercises.zad_3;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Integer[] integerArray = {3, 6, 9, 3, 34, 5, 11};
        System.out.println(Arrays.toString(integerArray));

        SwapElements.swap(integerArray, 3, 6);
        System.out.println(Arrays.toString(integerArray));

        System.out.println("------------------------------");
        String[] stringArray = {"Marcin", "Hania", "Alojz", "Gniewosz", "Bernard", "Gerwazy", "Beny"};
        System.out.println(Arrays.toString(stringArray));

        SwapElements.swap(stringArray, 2, 4);
        System.out.println(Arrays.toString(stringArray));
    }
}
