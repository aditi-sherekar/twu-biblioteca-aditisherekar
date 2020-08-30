package com.twu.biblioteca;

public class Movie {

    private final MovieTitle title;
    private final Director director;
    private final MovieYear year;

    public Movie(MovieTitle title, Director director, MovieYear year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String getMovieTitle() {

        return this.title.getMovieTitle();
    }

    public String getMovieDirector() {
        return this.director.getDirector();
    }

    public String getMovieYear() {

        return this.year.getMovieYear();
    }
}
