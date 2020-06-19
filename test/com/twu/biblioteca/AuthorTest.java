package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorTest {


    @Test
    public void doesGetAuthorGetCorrectAuthor(){

        Author author = new Author("F. Scott Fitzgerald");

        assertEquals("F. Scott Fitzgerald", author.getAuthor());

    }

    @Test
    public void doesGetAuthorHandleEmptyStringForAuthor(){

        Author author = new Author("");

        assertEquals("Author Not Given", author.getAuthor());
    }

}
