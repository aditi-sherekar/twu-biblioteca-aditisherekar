package com.twu.biblioteca;

public class Movie {

    private final Title title;
    private final Author author;
    private final Year year;

    public Movie(Title title, Author author, Year year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getMovieTitle() {

        return this.title.getMovieTitle();
    }

    public String getMovieDirector() {
        return this.author.getDirector();
    }

    public String getMovieYear() {

        return this.year.getMovieYear();
    }
}
