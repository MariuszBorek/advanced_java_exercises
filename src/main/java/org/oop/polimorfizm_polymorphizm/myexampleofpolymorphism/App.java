package org.oop.polimorfizm_polymorphizm.myexampleofpolymorphism;

public class App {
    public static void main(String[] args) {

        MyInterface myObject = new MyClass();
        MyInterface myObjectSe = new MyClassSecond();

        myObject.methodFromMyInterface();

        System.out.println("\nwywołana metoda print() z myObject");
        myObject.methodFromMyInterface();

        System.out.println("\nwywołana metoda print() z myObjectSe");
        myObjectSe.print();

    }
}
