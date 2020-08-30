package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {


    @Test
    public void doesGetDirectorGetCorrectDirector(){

        Director director = new Director("Ryan Coogler");

        assertEquals("Ryan Coogler", director.getDirector());

    }

    @Test
    public void doesGetDirectorHandleEmptyStringForDirector(){

        Director director = new Director("");

        assertEquals("Director Not Given", director.getDirector());
    }

}