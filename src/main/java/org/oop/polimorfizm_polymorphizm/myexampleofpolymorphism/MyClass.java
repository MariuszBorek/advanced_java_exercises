package org.oop.polimorfizm_polymorphizm.myexampleofpolymorphism;

public class MyClass implements MyInterface {
    @Override
    public void methodFromMyInterface() {
        System.out.println("metoda może z MyInterface ale napisana w MyClass");
    }

    @Override
    public void print() {
        System.out.println("print number 111 from MyClass");
    }
}
