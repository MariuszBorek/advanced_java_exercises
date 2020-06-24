package org.oopexercises.zad_2;

import org.w3c.dom.ls.LSOutput;

public abstract class Person {

    protected String name;
    protected String address;

    public Person() {
        name = null;
        address = null;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String hobby(String hobby);

    @Override
    public String toString() {
        return name + "->" +address;
    }
}
