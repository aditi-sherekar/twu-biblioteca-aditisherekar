package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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

        String header = "   | Book Title | Author | Publication Year |\n";
        Book book1 = new Book(new BookTitle("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new BookYear("1925"));
        String bookDetails = "1. | The Great Gatsby | F. Scott Fitzgerald | 1925 |\n";
        Library.bookList.clear();
        Library.addBook(book1);
        Menu.createOptionsList().get(displayNameIndex + 1).excuteOption();

        assertEquals(header + bookDetails, outContent.toString());
    }

    @Test
    public void doesDisplayBookListHandleEmptyBookLibraryError(){
        Integer displayNameIndex = Menu.createOptionsList().indexOf(new DisplayBookList());
        String header = "   | Book Title | Author | Publication Year |\n";
        String bookDetails = "   |      No books available to display      |";
        Library.bookList.clear();
        Menu.createOptionsList().get(displayNameIndex + 1).excuteOption();

        assertEquals(header + bookDetails, outContent.toString());
    }




}
