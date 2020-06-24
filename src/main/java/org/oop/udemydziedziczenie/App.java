package org.oop.udemydziedziczenie;

public class App {
    public static void main(String[] args) {

        System.out.println("-----konsturkory----");
        ClassFirst classFirst = new ClassFirst(5, 7);
        System.out.println("-----");
        ClassSecond classSecond = new ClassSecond(6);
        System.out.println("-----");
        ClassThird classThird = new ClassThird(7);
        System.out.println("-----");
        ClassThird classThird2 = new ClassThird();

        System.out.println("\n-----wywoływanie metod-----");
        classFirst.methodFromClassFirs();
        System.out.println("-----");
        classSecond.methodFromClassFirs();
        System.out.println("-----");
        classThird.methodFromClassFirs();

        System.out.println("\n-----klasa obiekt-----");

        Object object = new Object();
        SomeClass someClass = new SomeClass();

        System.out.println(object.getClass());
        System.out.println(someClass.getClass());

        System.out.println(classSecond instanceof ClassFirst);
        System.out.println(classFirst.equals(classSecond));
        System.out.println(classFirst.equals(classFirst));
        System.out.println(classFirst.toString());
        System.out.println(classFirst.hashCode());

        System.out.println("\n-----Rzutowanie obiektów-----");

        ClassSecond extendedClass = new ClassSecond();
        extendedClass.setNumber(999);
        extendedClass.showNumber();

        Object objectSe = (Object) extendedClass;

        ClassFirst basicClass = (ClassFirst) extendedClass;         // rzutowanie obiektów - tylko po co to?
        basicClass.showNumber();

//        ((ClassSecond)classFirst).methodFromClassSecond();      // rzutowanie w dół










    }
}
