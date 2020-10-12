package com.twu.biblioteca;

public class User {

    private final LibraryNumber number;
    private final Password password;

    public User(LibraryNumber libraryNumber, Password password) {

        this.number = libraryNumber;
        this.password = password;

    }

    public String getLibraryNumber() {
        return this.number.getLibraryNumber();
    }

    public String getPassword() {
        return this.password.getPassword();
    }

}
