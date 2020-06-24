package org.oop.klasalokalna_localclass;

public class MyClass {

    // klasa lokalna w metodzie
    void method(String key, int value) {
        class Pair {
            String key;
            int value;
        }
        Pair pair = new Pair();
        pair.key = key;
        pair.value = value;
    }
}
