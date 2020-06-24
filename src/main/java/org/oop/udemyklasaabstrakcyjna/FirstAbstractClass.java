package org.oop.udemyklasaabstrakcyjna;

public abstract class FirstAbstractClass {

    public void firstMethodFromFirstAbstractClass() {
        System.out.println("tekst z klasy abstrakcyjnej");
    }

    public abstract void abstractMethodFromAbstractClass();

    protected abstract int abstractMethodFromAbstractClassWithParameter(String str);

}
