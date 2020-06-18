package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void doesBookLibraryReturnListOfBooks(){

        ArrayList<Book> bookList = new ArrayList<Book>();
        Book book1 = new Book(new Title("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new Year("1925"));
        bookList.add(book1);

        assertEquals(bookList, Library.BookLibrary());
    }

    @Test
    public void doesLibraryReturnCorrectBookDetails(){

        Book book1 = new Book(new Title("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new Year("1925"));
        Library.addBook(book1);

        assertEquals("| The Great Gatsby | F. Scott Fitzgerald | 1925 |\n", Library.getBookDetails());


    }
}
