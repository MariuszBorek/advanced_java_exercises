package org.oop.anonimowa_anonymous.examplefirst;

public class App {
    public static void main(String[] args) {

        // klasa anonimowa przypisana do obiektu
        MyClass myClass = new MyClass() {
            // ciało klasy anonimowej
            @Override
            public void methodFromMyClass() {
                System.out.println("text z klasy App, napisana metoda z klasy MyClass");
            }
        };
        myClass.methodFromMyClass();
        
        System.out.println("--------------");
        // klasa anonimowa użyta jako parametr bez przypisywania do obiektu
        MyClass myClassTwo = new MyClass();
        methodFormApp(new MyClass() {
            @Override
            public void methodFromMyClass() {
                System.out.println("parametr nadpisany w klasie App");
            }
        });

        System.out.println("--------------");
        // wywołanie metody na obiekcie zwyczajnie
        MyClass myClassThree = new MyClass();
        myClassThree.methodFromMyClass();


    }

    public static void methodFormApp(MyClass parameter) {
        parameter.methodFromMyClass();
    }
}
