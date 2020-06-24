package org.generictypesexercises.exercises.zad_4;

public class Book extends MediaContent {

    String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " +
                "title " + super.toString() +
                ", author " + author;
    }
}
