package org.generictypesexercises.my_exercises.genericmethod;

import java.util.Collection;
import java.util.List;

public class Editor {

    /*
    metoda z używa WILDCARD
     */
    public static void displaySe(List<? extends Figure> list) {
        for (Figure figure : list) {
            System.out.println(figure.getName());
        }
    }

    /*
    użycie METODY GENERYCZNEJ pozwala na dodawanie w ciele metody
    dodatkowyc elementów do listy, wwildcard jest to nie możliwe
     */
    public static <T extends Figure> void display(List<T> list) {
        for (T figure : list) {
            System.out.println(figure.getName());
        }

        list.add((T) new Circle());
        list.add((T) new Circle());
        list.add((T) new Circle());
        list.add((T) new Circle());
        list.add(null);


        System.out.println("-----------------------");
        for (Figure figure : list) {
            if (figure == null) {
                System.out.println("null");
                break;
            }
            System.out.println(figure.getName());
        }

    }

    /*
    Przykład metody generycznej
    dodając <T> przed void tworzymy w metodzie zmienną której możemy
    używać w całym ciele metody, analogicznie jak w klasie
     */
    public static <T> void writeArrayToCollection(T[] array, Collection<T> collection) {
        for (T object : array) {
            collection.add(object);
        }
    }


}
