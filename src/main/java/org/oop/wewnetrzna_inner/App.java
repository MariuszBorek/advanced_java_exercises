package org.oop.wewnetrzna_inner;

public class App {
    public static void main(String[] args) {

        System.out.println("\n---Outer Class---");
        Outer outer = new Outer(); // wywołanie klasy zewnetrznej
        outer.outerMethod();
        System.out.println(outer.outerField);

        System.out.println("\n---Inner Class---");
        Outer.Inner inner = outer.new Inner(); // wywołanie klasy wewnętrznej
        inner.innerMethod();
        System.out.println(inner.innerField);

        System.out.println("\n---InnerInInner Class---");
        Outer.Inner.InnerInInner innerInInner = inner.new InnerInInner(); // wywołanie klasy jeszcze bardziej wewnętrznej
        innerInInner.innerInInnerMethod();
        System.out.println(innerInInner.innerInInnerField);

        System.out.println("\n---static Nested Class---");
        Outer.Nested.nestedMethod();
        System.out.println(Outer.Nested.nestedField);


    }

    // klasa lokalna w metodzie
    void method(String key, int value) {
        class Pair {
            String key;
            int value;
        }
    }
}
