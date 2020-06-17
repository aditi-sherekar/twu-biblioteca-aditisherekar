package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorTest {

    Author author = new Author("F. Scott Fitzgerald");

    @Test
    public void doesGetAuthorGetCorrectAuthor(){

        assertEquals("F. Scott Fitzgerald", author.getAuthor());

    }
}
