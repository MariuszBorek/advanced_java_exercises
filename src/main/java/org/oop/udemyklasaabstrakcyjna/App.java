package org.oop.udemyklasaabstrakcyjna;

public class App {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();

        myClass.abstractMethodFromAbstractClass();
        myClass.abstractMethodFromAbstractClassWithParameter("jest fajnie");
        myClass.firstMethodFromFirstAbstractClass();

    }
}
