package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookYearTest {


    @Test
    public void doesGetYearGetCorrectYear(){

        BookYear year = new BookYear("1925");

        assertEquals("1925", year.getYear());

    }

    @Test
    public void doesGetYearHandleEmptyStringForYear(){

        BookYear year = new BookYear("");

        assertEquals("Publication Year Not Given", year.getYear());
    }
}
