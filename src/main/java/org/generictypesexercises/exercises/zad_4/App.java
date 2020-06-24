package org.generictypesexercises.exercises.zad_4;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // books
        List<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", "J. K.  Rowling"));
        books.add(new Book("In the tall grass", "J. K.  Rowling"));

        Library<Book> bookLibrary = new Library<>(books);
        System.out.println(bookLibrary.toString());

        // movies
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Rubber", "Quentin Dupieux"));
        movies.add(new Movie("Django", "Quentin Tarantino"));

        Library<Movie> movieLibrary = new Library<>(movies);
        System.out.println(movieLibrary.toString());

        // newspapers
        List<Newspaper> newspapers = new ArrayList<>();
        newspapers.add(new Newspaper("Sydney Morning Herald", "AU"));
        newspapers.add(new Newspaper("The Times", "UK"));

        Library<Newspaper> newspaperLibrary = new Library<>(newspapers);
        System.out.println(newspaperLibrary.toString());

    }
}
