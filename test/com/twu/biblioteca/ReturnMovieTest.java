package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ReturnMovieTest {

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setupStream(){
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void doesMenuDisplayCorrectOptionName(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new ReturnMovie());

        assertEquals("Return Movies", Menu.createOptionsList().get(displayNameIndex + 6).displayOptionName());

    }

    @Test
    public void doesReturnMovieHandleIfNoCheckedOutMovies(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new ReturnMovie());

        Menu.createOptionsList().get(displayNameIndex + 6).excuteOption();

        assertEquals("There are no movies to be returned.\n", outContent.toString());
    }

    @Test
    public void doesReturnMovieGiveSuccessfulReturnMessage(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new ReturnMovie());

        Movie movie1 = new Movie(new MovieTitle("Black Panther"), new Director("Ryan Coogler"), new MovieYear("2018"));
        Library.checkedOutMovieList.add(movie1);
        String input = "Black Panther";
        ReturnMovie.processMovieReturn(input);

        assertEquals("Thank you for returning the movie.\n", outContent.toString());
    }

    @Test
    public void doesReturnMovieGiveUnSuccessfulReturnMessage(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new ReturnMovie());

        Movie movie1 = new Movie(new MovieTitle("Black Panther"), new Director("Ryan Coogler"), new MovieYear("2018"));
        Library.checkedOutMovieList.add(movie1);
        String input = "Not Black Panther";
        ReturnMovie.processMovieReturn(input);

        assertEquals("That movie is not valid to return.\n", outContent.toString());
    }

    @Test
    public void doesReturnMoviePutMovieBackInLibraryAfterReturn(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new ReturnMovie());
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        Movie movie1 = new Movie(new MovieTitle("Black Panther"), new Director("Ryan Coogler"), new MovieYear("2018"));
        movieList.add(movie1);
        Library.checkedOutMovieList.add(movie1);
        String input = "Black Panther";
        ReturnMovie.processMovieReturn(input);

        assertEquals(movieList, Library.MovieLibrary());
    }

    @Test
    public void doesReturnMovieRemoveMovieFromCheckedOutMovieAfterReturn(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new ReturnMovie());
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        Movie movie1 = new Movie(new MovieTitle("Black Panther"), new Director("Ryan Coogler"), new MovieYear("2018"));
        Library.checkedOutMovieList.add(movie1);
        String input = "Black Panther";
        ReturnMovie.processMovieReturn(input);

        assertEquals(movieList, Library.CheckedOutMovie());
    }

}
