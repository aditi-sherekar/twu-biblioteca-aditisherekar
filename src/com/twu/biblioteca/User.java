package com.twu.biblioteca;

import java.util.concurrent.CopyOnWriteArrayList;

public class User {

    private final String libraryNumber;
    private final String password;
    private final String name;
    private final String email;
    private final String phoneNumber;
    public static CopyOnWriteArrayList<Book> userBookList = new CopyOnWriteArrayList<Book>();
    public static CopyOnWriteArrayList<Movie> userMovieList = new CopyOnWriteArrayList<Movie>();

    public User(String libraryNumber, String password, String name, String email, String phoneNumber) {

        this.libraryNumber = libraryNumber;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public static void addUserBooks(Book book) {
        userBookList.add(book);
    }

    public static void addUserMovies(Movie movie) {
        userMovieList.add(movie);}

    public static void removeUserBooks(Book book) {
        userBookList.remove(book);
    }

    public static void removeUserMovies(Movie movie) {
        userMovieList.remove(movie);}

    public String getLibraryNumber() {
        return this.libraryNumber;
    }

    public String getPassword() {

        return this.password;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
         return this.email;
    }

    public String getPhoneNumber() {

        return this.phoneNumber;

    }

    public CopyOnWriteArrayList<Book> getUserBooks() {

        return this.userBookList;
    }

    public CopyOnWriteArrayList<Movie> getUserMovies() {

        return this.userMovieList;
    }
}
