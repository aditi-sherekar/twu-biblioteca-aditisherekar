package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YearTest {


    @Test
    public void doesGetYearGetCorrectYear(){

        Year year = new Year("1925");

        assertEquals("1925", year.getYear());

    }

    @Test
    public void doesGetYearHandleEmptyStringForYear(){

        Year year = new Year("");

        assertEquals("Publication Year Not Given", year.getYear());
    }
}
