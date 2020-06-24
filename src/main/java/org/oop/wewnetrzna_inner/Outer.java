package org.oop.wewnetrzna_inner;

public class Outer {
    int outerField;

    int outerMethod() { // nie ma dostępu dometod i pól z klasy wewnętrznej
        System.out.println("write form Outer class");
        Inner inner = new Inner(); // po stworzeniu obiektu z klasy wewnętrznej możemy na obiekcie wywoływać pola i metody z klasy wewnetrznej
        inner.innerField = 10;
//        inner.innerMethod();
        return -1;
    }

    static class Nested {
        static int nestedField;

        static int nestedMethod() {
            System.out.println("write form Nestted class");
            System.out.println();
            return -2;
        }
    }

    class Inner {
        int innerField; // podobnie jak zmienna lokalna, pole dostępne tylko w zakresie klamer klasy. Dlatego mozna wykożystywać metody i pola z klasy zewnętrznej

        int innerMethod() {
            System.out.println("write form Inner class");
            outerMethod(); // można w metodzie klasy wewnetrznej wywołać metode klasy zewnętrznej
            outerField = 101; // można w metodzie klasy wewnetrznej wywołać pole klasy zewnętrznej
            return -2;
        }

        class InnerInInner {
            int innerInInnerField;

            int innerInInnerMethod() {
                System.out.println("write form InnerInInner class");
                return -3;
            }
        }
    }
}
