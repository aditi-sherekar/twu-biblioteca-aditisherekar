package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TitleTest {

    Title title = new Title("The Great Gatsby");

    @Test
    public void doesGetTitleGetCorrectTitle(){

        assertEquals("The Great Gatsby", title.getTitle());

    }
}
