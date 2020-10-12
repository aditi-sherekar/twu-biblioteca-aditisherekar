package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DisplayMovieListTest {

    @Test
    public void doesMenuDisplayCorrectOptionName(){

        Integer displayNameIndex = Menu.optionsList.indexOf(new DisplayMovieList());

        assertEquals("Display Movies", Menu.optionsList.get(displayNameIndex + 2).displayOptionName());

    }

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setupStream(){
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void doesDisplayMovieListDisplayCorrectMovieDetailsWithHeader(){

        Integer displayNameIndex = Menu.optionsList.indexOf(new DisplayMovieList());

        String header = "   | Movie Title | Director | Release Year |\n";
        Movie movie1 = new Movie(new MovieTitle("Black Panther"), new Director("Ryan Coogler"), new MovieYear("2018"));
        String movieDetails = "1. | Black Panther | Ryan Coogler | 2018 |\n";
        Library.movieList.clear();
        Library.addMovie(movie1);
        Menu.optionsList.get(displayNameIndex + 2).excuteOption();

        assertEquals(header + movieDetails, outContent.toString());
    }

    @Test
    public void doesDisplayMovieListHandleEmptyMovieLibraryError(){
        Integer displayNameIndex = Menu.optionsList.indexOf(new DisplayMovieList());
        String header = "   | Movie Title | Director | Release Year |\n";
        String movieDetails = "   |      No movies available to display      |";
        Library.movieList.clear();
        Menu.optionsList.get(displayNameIndex + 2).excuteOption();

        assertEquals(header + movieDetails, outContent.toString());
    }




}