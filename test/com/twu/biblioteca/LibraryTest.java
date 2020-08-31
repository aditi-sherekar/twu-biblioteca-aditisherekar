package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LibraryTest {

    @Test
    public void doesBookLibraryReturnListOfBooks(){

        ArrayList<Book> bookList = new ArrayList<Book>();
        Book book1 = new Book(new Title("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new BookYear("1925"));
        bookList.add(book1);

        assertEquals(bookList, Library.BookLibrary());
    }

    @Test
    public void doesLibraryReturnCorrectBookDetails(){

        Book book1 = new Book(new Title("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new BookYear("1925"));
        Library.addBook(book1);

        assertEquals("| The Great Gatsby | F. Scott Fitzgerald | 1925 |\n", Library.getBookDetails());

    }

   // @Rule
   // public ExpectedException exception = ExpectedException.none();

    @Test
    public void doesAddBookHandleNullPointerException()  {
        try {

            Library.addBook(null);
            fail();
        } catch (NullPointerException ex) {
            assertEquals("The argument cannot be null", ex.getMessage());
        }
    }

    @Test
    public void doesAddBookHandleNoTitleBook(){
        try {
            Book book1 = new Book(new Title(""), new Author("F. Scott Fitzgerald"), new BookYear("1925"));
            Library.addBook(book1);
            fail();
        } catch (NullPointerException ex) {
            assertEquals("The book requires a title", ex.getMessage());
        }
    }

    @Test
    public void doesMovieLibraryReturnListOfMovies(){

        ArrayList<Movie> movieList = new ArrayList<Movie>();
        Movie movie1 = new Movie(new MovieTitle("Black Panther"), new Director("Ryan Coogler"), new MovieYear("2018"));
        movieList.add(movie1);

        assertEquals(movieList, Library.MovieLibrary());
    }

    @Test
    public void doesLibraryReturnCorrectMovieDetails(){

        Movie movie1 = new Movie(new MovieTitle("Black Panther"), new Director("Ryan Coogler"), new MovieYear("2018"));
        Library.addMovie(movie1);

        assertEquals("| Black Panther | Ryan Coogler | 2018 |\n", Library.getMovieDetails());

    }

    @Test
    public void doesAddMovieHandleNullPointerException()  {
        try {

            Library.addMovie(null);
            fail();
        } catch (NullPointerException ex) {
            assertEquals("The argument cannot be null", ex.getMessage());
        }
    }

    @Test
    public void doesAddMovieHandleNoTitleMovie(){
        try {
            Movie movie1 = new Movie(new MovieTitle(""), new Director("Ryan Coogler"), new MovieYear("2018"));
            Library.addMovie(movie1);
            fail();
        } catch (NullPointerException ex) {
            assertEquals("The movie requires a title", ex.getMessage());
        }
    }

}
