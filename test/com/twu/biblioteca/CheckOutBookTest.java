package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CheckOutBookTest {

    @Test
    public void doesMenuDisplayCorrectOptionName(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new CheckOutBook());

        assertEquals("Check-out Books", Menu.createOptionsList().get(displayNameIndex + 2).displayOptionName());

    }

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setupStream(){
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void doesCheckOutBookHandleWrongBookTitleEntered(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new CheckOutBook());

        Book book1 = new Book(new Title("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new Year("1925"));
        Library.addBook(book1);
        String input = "Hello";
        CheckOutBook.processBookCheckOut(input);

        assertEquals("Sorry, that book is not available!\n", outContent.toString());
    }


    @Test
    public void doesCheckOutBookGiveSuccessfulCheckOutMessage(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new CheckOutBook());

        Book book1 = new Book(new Title("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new Year("1925"));
        Library.addBook(book1);
        String input = "The Great Gatsby";
        CheckOutBook.processBookCheckOut(input);

        assertEquals("Thank you! Enjoy the book!\n", outContent.toString());
    }

    @Test
    public void doesCheckOutBookRemoveBookFromLibraryAfterCheckOut(){

        ArrayList<Book> bookList = new ArrayList<Book>();
        Book book1 = new Book(new Title("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new Year("1925"));
        Library.addBook(book1);
        String input = "The Great Gatsby";
        CheckOutBook.processBookCheckOut(input);

        assertEquals(bookList, Library.BookLibrary());
    }

    @Test
    public void doesCheckOutBookAddBookToCheckedOutBookAfterCheckOut(){

        ArrayList<Book> bookList = new ArrayList<Book>();
        Book book1 = new Book(new Title("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new Year("1925"));
        bookList.add(book1);
        Library.addBook(book1);
        String input = "The Great Gatsby";
        CheckOutBook.processBookCheckOut(input);

        assertEquals(bookList, Library.CheckedOutBook());
    }

}