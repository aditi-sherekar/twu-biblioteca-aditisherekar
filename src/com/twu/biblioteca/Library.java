package com.twu.biblioteca;

import java.util.concurrent.CopyOnWriteArrayList;

public class Library {


    static CopyOnWriteArrayList<Book> bookList = new CopyOnWriteArrayList<Book>();
    static CopyOnWriteArrayList<Book> checkedOutBookList = new CopyOnWriteArrayList<Book>();
    static CopyOnWriteArrayList<Movie> movieList = new CopyOnWriteArrayList<Movie>();
    static CopyOnWriteArrayList<Movie> checkedOutMovieList = new CopyOnWriteArrayList<Movie>();
    static CopyOnWriteArrayList<User> userList = new CopyOnWriteArrayList<User>();

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

    public static void addMovie(Movie movie) {

        if (movie == null){
            throw new NullPointerException("The argument cannot be null");
        }
        else if (movie.getMovieTitle() == ""){
            throw new NullPointerException("The movie requires a title");
        }
        else{
            movieList.add(movie);
        }
    }

    public static CopyOnWriteArrayList<Movie> MovieLibrary() {
        return movieList;
    }

    public static String getMovieDetails() {

        String movieDetails = "";

        for(Movie movie : movieList){
            movieDetails += ((movieList.indexOf(movie) + 1) + ". " + "| " + movie.getMovieTitle() + " | " + movie.getMovieDirector() + " | " + movie.getMovieYear() + " |\n");

        }
        return movieDetails;
    }


    public static CopyOnWriteArrayList<Movie> CheckedOutMovie(){


        return checkedOutMovieList;
    }

    public static void addUser(User user) {

        if (user == null){
            throw new NullPointerException("The argument cannot be null");
        }
        else if (user.getLibraryNumber() == "" || user.getPassword() == "" ){
            throw new NullPointerException("The movie requires a username and/or password");
        }
        else{
            userList.add(user);
        }
    }

    public static String getUserLibraryNumber(){

        String userLibraryNumber = "";

        for(User user : userList){
            userLibraryNumber = user.getLibraryNumber();

        }
        return userLibraryNumber;
    }

    public static String getUserPassword(){

        String userPassword = "";

        for(User user : userList){
            userPassword = user.getPassword();

        }
        return userPassword;
    }

    public static CopyOnWriteArrayList<User> UserLibrary() {
        return userList;

    }
}
