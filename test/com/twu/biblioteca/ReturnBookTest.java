package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ReturnBookTest {

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setupStream(){
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void doesMenuDisplayCorrectOptionName(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new ReturnBook());

        assertEquals("Return Books", Menu.createOptionsList().get(displayNameIndex + 4).displayOptionName());

    }

    @Test
    public void doesReturnBookHandleIfNoCheckedOutBooks(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new ReturnBook());

        Menu.createOptionsList().get(displayNameIndex + 4).excuteOption();

        assertEquals("There are no books to be returned.\n", outContent.toString());
    }

    @Test
    public void doesReturnBookGiveSuccessfulReturnMessage(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new ReturnBook());

        Book book1 = new Book(new BookTitle("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new BookYear("1925"));
        Library.checkedOutBookList.add(book1);
        String input = "The Great Gatsby";
        ReturnBook.processBookReturn(input);

        assertEquals("Thank you for returning the book.\n", outContent.toString());
    }

    @Test
    public void doesReturnBookGiveUnSuccessfulReturnMessage(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new ReturnBook());

        Book book1 = new Book(new BookTitle("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new BookYear("1925"));
        Library.checkedOutBookList.add(book1);
        String input = "Not The Great Gatsby";
        ReturnBook.processBookReturn(input);

        assertEquals("That book is not valid to return.\n", outContent.toString());
    }

    @Test
    public void doesReturnBookPutBookBackInLibraryAfterReturn(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new ReturnBook());
        ArrayList<Book> bookList = new ArrayList<Book>();
        Book book1 = new Book(new BookTitle("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new BookYear("1925"));
        bookList.add(book1);
        Library.checkedOutBookList.add(book1);
        String input = "The Great Gatsby";
        ReturnBook.processBookReturn(input);

        assertEquals(bookList, Library.BookLibrary());
    }

    @Test
    public void doesReturnBookRemoveBookFromCheckedOutBookAfterReturn(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new ReturnBook());
        ArrayList<Book> bookList = new ArrayList<Book>();
        Book book1 = new Book(new BookTitle("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new BookYear("1925"));
        Library.checkedOutBookList.add(book1);
        String input = "The Great Gatsby";
        ReturnBook.processBookReturn(input);

        assertEquals(bookList, Library.CheckedOutBook());
    }

}
