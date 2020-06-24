package org.calssinterfaceexercises.zad_2;

public class App {
    public static void main(String[] args) {
        Movie movie = new Movie.MovieCreator()
                .setTitle("Star Wars")
                .setDirector("J.J Abrams")
                .setGenre("Action")
                .setYearOfPublishment(2015)
                .setPublisher("Disney")
                .movieCreator();
        System.out.println(movie);

        // UWAGA! domyślam się tylko! "return this;" zwraca obiekt klasy MovieCreator, czyli mozna go sout'ować, chyba
        System.out.println(new Movie.MovieCreator().setTitle("mordercza opona 2").setGenre("klasa Z"));
        System.out.println(new Movie.MovieCreator().setDirector("Johny Benet"));

        Movie.MovieCreator car2 = new Movie.MovieCreator();

    }
}
