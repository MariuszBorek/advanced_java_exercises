package org.oop.kompozycja_composition;

class Processor {
    String name;
    int numberOfCores;

    public Processor(String name, int numberOfCores) {
        this.name = name;
        this.numberOfCores = numberOfCores;
    }

    @Override
    public String toString() {
        return name + " " +numberOfCores;
    }
}
