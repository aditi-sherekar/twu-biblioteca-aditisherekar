package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TitleTest {


    @Test
    public void doesGetTitleGetCorrectTitle(){

        Title title = new Title("The Great Gatsby");

        assertEquals("The Great Gatsby", title.getTitle());

    }

}
