package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTitleTest {


    @Test
    public void doesGetMovieTitleGetCorrectTitle(){

        MovieTitle title = new MovieTitle("Black Panther");

        assertEquals("Black Panther", title.getMovieTitle());

    }

}