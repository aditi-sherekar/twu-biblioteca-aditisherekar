package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book = new Book(new Title("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new Year("1925"));

    @Test
    public void doesGetBookTitleGetCorrectTitle(){

        assertEquals("The Great Gatsby", book.getBookTitle());

    }

    @Test
    public void doesGetBookAuthorGetCorrectAuthor(){

        assertEquals("F. Scott Fitzgerald", book.getBookAuthor());

    }

    @Test
    public void doesGetBookYearGetCorrectYear(){

        assertEquals("1925", book.getBookYear());

    }


}
