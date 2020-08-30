package com.twu.biblioteca;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

public class Library {


    static CopyOnWriteArrayList<Book> bookList = new CopyOnWriteArrayList<Book>();
    static CopyOnWriteArrayList<Book> checkedOutBookList = new CopyOnWriteArrayList<Book>();
    static CopyOnWriteArrayList<Movie> movieList = new CopyOnWriteArrayList<Book>();
    static CopyOnWriteArrayList<Movie> checkedOutMovieList = new CopyOnWriteArrayList<Book>();

    public static void addBook(Book book) {

        if (book == null){
            throw new NullPointerException("The argument cannot be null");
        }
        else if (book.getBookTitle() == ""){
            throw new NullPointerException("The book requires a title");
        }
        else{
            bookList.add(book);
        }
        //return bookList;
       // return null;
    }



    public static CopyOnWriteArrayList<Book> BookLibrary(){

        return bookList;
    }

    public static String getBookDetails(){

        String bookDetails = "";

        for(Book book : bookList){
            bookDetails += ((bookList.indexOf(book) + 1) + ". " + "| " + book.getBookTitle() + " | " + book.getBookAuthor() + " | " + book.getBookYear() + " |\n");

        }
        return bookDetails;
    }

    public static CopyOnWriteArrayList<Book> CheckedOutBook(){


        return checkedOutBookList;
    }

    public static CopyOnWriteArrayList<Movie> MovieLibrary() {
        return movieList;
    }
}
