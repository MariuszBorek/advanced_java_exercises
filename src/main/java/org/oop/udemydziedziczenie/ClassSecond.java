package org.oop.udemydziedziczenie;

public class ClassSecond extends ClassFirst {


    public ClassSecond() {
        super(3);           // odwołuje się do konstruktora jednoparametrowego z (ClassSecond)klasy nadrzędnej
    }

    public ClassSecond(int x) {
        super(x);
        System.out.println("napisałem konstruktor z klasy pierwszej w klasie drugiej");
    }

    @Override
    void methodFromClassFirs() {
        super.methodFromClassFirs();        // odwołuje się do metody z ClassFirst(klasy nadrzędnej), bez słówka "super" metoda sama się wywoła, nastąpi zapętlenie, rekurencja
        System.out.println("wypisano z klasy drugiej");
    }

    void methodFromClassSecond() {
        System.out.println("wypisano z  klasy drugiej");
    }

}
