package org.generictypesexercises.my_exercises.wildcard;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<String> listOfStrings = new ArrayList<>();

        List<SuperClass> listSuperClass = new ArrayList<>();
        listSuperClass.add(new SuperClass());
        listSuperClass.add(new SubClass());
        listSuperClass.add(new SubSubClass());
        listSuperClass.add(new SubSubClass());
        listSuperClass.add(new SubSubClass());

        SuperClass.tester(listSuperClass);
        SuperClass.tester(listSuperClass);


    }
}
