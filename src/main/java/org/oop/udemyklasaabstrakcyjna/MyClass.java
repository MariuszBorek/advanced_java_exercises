package org.oop.udemyklasaabstrakcyjna;

public class MyClass extends FirstAbstractClass {
    @Override
    public void abstractMethodFromAbstractClass() {
        System.out.println("wypisano z MyClass");
    }

    @Override
    protected int abstractMethodFromAbstractClassWithParameter(String str) {
        System.out.println("wypisuje parametr: " + str);
        return 102;
    }
}
