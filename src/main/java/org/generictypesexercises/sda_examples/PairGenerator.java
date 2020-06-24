package org.generictypesexercises.sda_examples;

public class PairGenerator {
    public static <K, V> Pair<K, V> generatePair(K key, V value) {
        Pair<K, V> pair = new Pair<K, V>();
        pair.setKey(key);
        pair.setValue(value);
        return pair;
    }

    public static void main(String[] args) {
        final Pair<Integer, String> firstPair = PairGenerator.generatePair(1, "value1");
        final Pair<Long, String> secondPair = PairGenerator.<Long, String>generatePair(2L, "value2");
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
