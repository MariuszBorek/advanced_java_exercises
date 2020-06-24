package org.oop.kompozycja_composition;

class Ram {
    String name;
    int size;

    public Ram(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return name + " " + size;
    }
}
