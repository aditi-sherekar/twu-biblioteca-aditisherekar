package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    Movie movie = new Movie(new MovieTitle("Black Panther"), new Director("Ryan Coogler"), new MovieYear("2018"));

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