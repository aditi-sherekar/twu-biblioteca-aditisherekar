package com.twu.biblioteca;

import org.junit.Test;

import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.Assert.assertEquals;

public class UserTest {

    CopyOnWriteArrayList<Book> userBookList = new CopyOnWriteArrayList<Book>();

    User user = new User("123-4567", "Password", "Aditi Sherekar", "aditisherekar@test.com", "12345678", userBookList);

    @Test
    public void doesGetLibraryNumberGetCorrectNumber(){

        assertEquals("123-4567", user.getLibraryNumber());

    }

    @Test
    public void doesGetPasswordGetCorrectPassword(){

        assertEquals("Password", user.getPassword());

    }

    @Test
    public void doesGetNameGetCorrectName(){

        assertEquals("Aditi Sherekar", user.getName());

    }

    @Test
    public void doesGetEmailGetCorrectEmail(){

        assertEquals("aditisherekar@test.com", user.getEmail());

    }

    @Test
    public void doesGetPhoneNumberGetCorrectPhoneNumber(){

        assertEquals("12345678", user.getPhoneNumber());

    }

    @Test
    public void doesGetUserBookListGetListOfBooks(){

        Book book = new Book(new BookTitle("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new BookYear("1925"));

        userBookList.add(book);

        assertEquals(userBookList, user.getUserBooks());

    }


}
