package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class UserDetailsTest {


    //User user = new User("123-4567", "Password", "Aditi Sherekar", "aditisherekar@test.com", "12345678", userBookList);

    @Test
    public void doesMenuDisplayCorrectOptionName(){

        UserLogin.isLoggedIn = true;

        Integer displayNameIndex = Menu.createOptionsList().indexOf(new UserDetails());

        assertEquals("User Details", Menu.createOptionsList().get(displayNameIndex + 7).displayOptionName());

    }

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setupStream(){
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void doesUserDetailsReturnDetailsOfUser(){

        Book book = new Book(new BookTitle("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new BookYear("1925"));
        Movie movie = new Movie(new MovieTitle("Black Panther"), new Director("Ryan Coogler"), new MovieYear("2018"));
        User user = new User("123-4567", "Password", "Aditi Sherekar", "aditisherekar@test.com", "12345678");
        Library.userLoggedInList.add(user);
        UserLogin.isLoggedIn = true;
        User.userBookList.add(book);
        User.userMovieList.add(movie);
        UserDetails.printUserDetails();

        assertEquals("User Details\n\n" +
                "Name: Aditi Sherekar\n" +
                "Library Number: 123-4567\n" +
                "Email: aditisherekar@test.com\n" +
                "Phone Number: 12345678\n" +
                "Checked-out Books: The Great Gatsby, \n" +
                "Checked-out Movies: The Black Panther, \n", outContent.toString());
    }


}
