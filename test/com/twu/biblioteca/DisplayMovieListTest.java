package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DisplayMovieListTest {

    @Test
    public void doesMenuDisplayCorrectOptionName(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new DisplayMovieList());

        assertEquals("Display Movies", Menu.createOptionsList().get(displayNameIndex + 1).displayOptionName());

    }

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setupStream(){
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void doesDisplayMovieListDisplayCorrectMovieDetailsWithHeader(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new DisplayMovieList());

        String header = "   | Movie Title | Director | Release Year |\n";
        Movie movie1 = new Movie(new Title("Black Panther"), new Director("Ryan Coogler"), new ReleaseYear("2018"));
        String movieDetails = "1. | Black Panther | Ryan Coogler | 2018 |\n";
        Library.addMovie(movie1);
        Menu.createOptionsList().get(displayNameIndex + 1).excuteOption();

        assertEquals(header + movieDetails, outContent.toString());
    }

    @Test
    public void doesDisplayMovieListHandleNullMovieLibraryError(){
        Integer displayNameIndex = Menu.createOptionsList().indexOf(new DisplayMovieList());
        String header = "   | Movie Title | Director | Release Year |\n";
        String movieDetails = "   |      No movies available to display      |";
        Library.addMovie(null);
        Menu.createOptionsList().get(displayNameIndex + 1).excuteOption();

        assertEquals(header + movieDetails, outContent.toString());
    }




}