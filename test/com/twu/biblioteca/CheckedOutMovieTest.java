package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CheckOutMovieTest {

    @Test
    public void doesMenuDisplayCorrectOptionName() {

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new CheckOutMovie());

        assertEquals("Check-out Movie", Menu.createOptionsList().get(displayNameIndex + 4).displayOptionName());

    }

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setupStream() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void doesCheckOutMovieHandleWrongBookTitleEntered() {

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new CheckOutMovie());

        Movie movie1 = new Movie(new MovieTitle("Black Panther"), new Director("Ryan Coogler"), new MovieYear("2018"));
        Library.addMovie(movie1);
        String input = "Hello";
        CheckOutMovie.processMovieCheckOut(input);

        assertEquals("Sorry, that movie is not available!\n", outContent.toString());
    }


}