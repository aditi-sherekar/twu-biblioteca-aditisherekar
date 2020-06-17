package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YearTest {

    Year year = new Year("1925");

    @Test
    public void doesGetYearGetCorrectYear(){

        assertEquals("1925", year.getYear());

    }
}
