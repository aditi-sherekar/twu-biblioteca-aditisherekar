package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DisplayBookListTest {

    @Test
    public void doesMenuDisplayCorrectOptionName(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new DisplayBookList());

        assertEquals("Display Books", Menu.createOptionsList().get(displayNameIndex + 1).displayOptionName());

    }

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setupStream(){
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void doesDisplayBookListDisplayCorrectBookDetailsWithHeader(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new DisplayBookList());

        String header = "| Book Title | Authour | Publication Year |\n";
        Book book1 = new Book(new Title("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new Year("1925"));
        String bookDetails = "| The Great Gatsby | F. Scott Fitzgerald | 1925 |\n";
        Library.BookLibrary(book1);
        Menu.createOptionsList().get(displayNameIndex + 1).excuteOption();

        assertEquals(header + bookDetails, outContent.toString());


    }


}
