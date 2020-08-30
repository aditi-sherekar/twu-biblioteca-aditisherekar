package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    Movie movie = new Movie(new Title("The Great Gatsby"), new Director("F. Scott Fitzgerald"), new Year("1925"));

    @Test
    public void doesGetMovieTitleGetCorrectTitle(){

        assertEquals("Black Panther", movie.getMovieTitle());

    }

    @Test
    public void doesGetMovieDirectorGetCorrectDirector(){

        assertEquals("Ryan Coogler", movie.getMovieDirector());

    }

    @Test
    public void doesGetMovieYearGetCorrectYear(){

        assertEquals("2018", movie.getMovieYear());

    }


}