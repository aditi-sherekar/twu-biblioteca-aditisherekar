package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.Assert.assertEquals;

public class UserLoginTest {

    @Test
    public void doesMenuDisplayCorrectOptionName(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new UserLogin());

        assertEquals("Login", Menu.createOptionsList().get(displayNameIndex + 7).displayOptionName());

    }

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setupStream(){
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void doesUserLoginHandleIncorrectLibraryNumberAndPassword(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new UserLogin());

        CopyOnWriteArrayList<Book> userBookList = new CopyOnWriteArrayList<Book>();

        User user1 = new User("123-4567", "Password", "Full Name", "fullname@outlook.com", "08001234567", userBookList);
        Library.addUser(user1);
        String libraryNumber = "1230987";
        String password = "Hello";
        UserLogin.processLogin(libraryNumber, password);

        assertEquals("Sorry, the library number or password entered was incorrect. Please try again.\n", outContent.toString());
    }

    @After
    public void deleteOutputFile() {
        .delete();}

    @Test
    public void doesCorrectCredentialsPrintSuccessfulMessage(){

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new UserLogin());

        CopyOnWriteArrayList<Book> userBookList = new CopyOnWriteArrayList<Book>();

        User user1 = new User("123-4567", "Password", "Full Name", "fullname@outlook.com", "08001234567", userBookList);
        Library.addUser(user1);
        String libraryNumber = "123-4567";
        String password = "Password";
        UserLogin.processLogin(libraryNumber, password);

        assertEquals("You have successfully logged in!\n", outContent.toString());

    }


}
