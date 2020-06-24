package org.calssinterfaceexercises.zad_2;

public class Movie {
    private String title;
    private String director;
    private int yearOfPublishment;
    private String genre;
    private String publisher;

    public Movie(String title, String director, int yearOfPublishment, String genre, String publisher) {
        this.title = title;
        this.director = director;
        this.yearOfPublishment = yearOfPublishment;
        this.genre = genre;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfPublishment() {
        return yearOfPublishment;
    }

    public void setYearOfPublishment(int yearOfPublishment) {
        this.yearOfPublishment = yearOfPublishment;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearOfPublishment=" + yearOfPublishment +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    static class MovieCreator {
        private String title;
        private String director;
        private int yearOfPublishment;
        private String genre;
        private String publisher;

        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieCreator setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieCreator setYearOfPublishment(int yearOfPublishment) {
            this.yearOfPublishment = yearOfPublishment;
            return this;
        }

        public MovieCreator setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieCreator setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        Movie movieCreator() {
            Movie movie = new Movie(title, director, yearOfPublishment, genre, publisher);
            return movie;
        }

        @Override
        public String toString() {
            return "MovieCreator{" +
                    "title='" + title + '\'' +
                    ", director='" + director + '\'' +
                    ", yearOfPublishment=" + yearOfPublishment +
                    ", genre='" + genre + '\'' +
                    ", publisher='" + publisher + '\'' +
                    '}';
        }
    }


}
