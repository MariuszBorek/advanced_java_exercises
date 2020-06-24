package org.generictypesexercises.exercises.zad_4;

public class Newspaper extends MediaContent {

    String country;

    public Newspaper(String title, String author) {
        super(title);
        this.country = author;
    }

    @Override
    public String toString() {
        return "Newspaper: " +
                "title " + super.toString() +
                ", country " + country;
    }
}
