package org.generictypesexercises.my_exercises.genericmethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Figure figure1 = new Circle();
        Figure figure2 = new Square();

        List<Figure> figureList = new ArrayList<>();
        figureList.add(figure1);
        figureList.add(figure2);

        Editor.display(figureList);

        Float[] floatArray = new Float[50];
        Integer[] integerArray = new Integer[50];
        Number[] numbersArray = new Number[50];
        Figure[] figuresArray = new Figure[50];

        Collection<Number> numberCollection = new ArrayList<>();
        Editor.writeArrayToCollection(floatArray, numberCollection);
        Editor.writeArrayToCollection(integerArray, numberCollection);
        Editor.writeArrayToCollection(numbersArray, numberCollection);

    }
}
