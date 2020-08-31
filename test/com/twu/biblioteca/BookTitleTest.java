package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTitleTest {


    @Test
    public void doesGetTitleGetCorrectTitle(){

        BookTitle title = new BookTitle("The Great Gatsby");

        assertEquals("The Great Gatsby", title.getBookTitle());

    }

}
