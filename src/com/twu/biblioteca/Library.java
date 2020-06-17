package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {

    private static ArrayList<Book> bookList = new ArrayList<Book>();


    public static ArrayList<Book> BookLibrary(Book book){

        bookList.add(book);

        return bookList;
    }

    public static String getBookDetails(){

        String bookDetails = "";

        for(Book book: bookList){
            bookDetails += "| " + book.getBookTitle() + " | " + book.getBookAuthor() + " | " + book.getBookYear() + " |\n";

        }
        return bookDetails;
    }

}
