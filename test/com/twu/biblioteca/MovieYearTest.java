package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieYearTest {


    @Test
    public void doesGetMovieYearGetCorrectYear(){

        MovieYear year = new MovieYear("2018");

        assertEquals("1925", year.getMovieYear());

    }

    @Test
    public void doesGetMovieYearHandleEmptyStringForYear(){

        MovieYear year = new MovieYear("");

        assertEquals("Release Year Not Given", year.getMovieYear());
    }
}