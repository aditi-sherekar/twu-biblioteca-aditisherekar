package com.twu.biblioteca;

import java.util.concurrent.CopyOnWriteArrayList;

public class User {

    private final String libraryNumber;
    private final String password;
    private final String name;
    private final String email;
    private final String phoneNumber;
    public static CopyOnWriteArrayList<Book> userBookList = new CopyOnWriteArrayList<Book>();


    public User(String libraryNumber, String password, String name, String email, String phoneNumber, CopyOnWriteArrayList<Book> books) {

        this.libraryNumber = libraryNumber;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userBookList = books;
    }

    public static void addUserBooks(Book book) {
        userBookList.add(book);
    }

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
}
