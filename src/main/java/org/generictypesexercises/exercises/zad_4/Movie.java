package org.generictypesexercises.exercises.zad_4;

public class Movie extends MediaContent {

    String author;

    public Movie(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String toString() {
        return "Movie: " +
                "title " + super.toString() +
                ", author " + author;
    }
}
