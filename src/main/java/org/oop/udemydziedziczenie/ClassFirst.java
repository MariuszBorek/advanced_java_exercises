package org.oop.udemydziedziczenie;

public class ClassFirst {

    int x;
    int y;
    int number;

    public ClassFirst() {
        System.out.println("konstruktor bezparametrowy z pierwszej klasy");
    }

    public ClassFirst(int x) {
        this();         // wywołanie konstruktora bezparametrowego w konstruktorze jednoparametrowym i nadanie parametrowi wartości
        this.x = x;
        System.out.println("konsstruktor z parametrem x = " + x);
    }

    public ClassFirst(int x, int y) {
        this(x);        // wywołanie konstruktora jednoparametrowego w konstruktorze dwuparametrowym i nadanie parametrowi wartości
        this.y = y;
        System.out.println("konstruktor z parametrem x = " + x + ", y = " + y);
    }

    void methodFromClassFirs() {
        this.secondMethodFromClassFirst();      // odwołanie się do metody z tej klasy
        System.out.println("wypisano z klasy pierwszej");
    }

    void secondMethodFromClassFirst() {
        System.out.println("wyswietlone z drugiej metody z klasy pierwszej");
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void showNumber() {
        System.out.println("number = " + number);
    }
}
