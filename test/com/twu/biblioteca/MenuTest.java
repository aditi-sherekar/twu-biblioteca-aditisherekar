package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setupStream(){
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void displaysWelcomeMessage(){
        Menu.printWelcomeMessage();
        assertEquals("\nWelcome to Biblioteca. Your one-stop-shop for great book titles in Banglore!\n", outContent.toString());
    }

    @Test
    public void displaysLoggedOutMenu(){
        UserLogin.isLoggedIn = false;
        Menu.printMenu();
        assertEquals("\n---------Menu---------\n" +
                "1. Display Books\n" +
                "2. Display Movies\n" +
                "3. Check-out Books\n" +
                "4. Check-out Movies\n" +
                "5. Return Books\n" +
                "6. Return Movies\n" +
                "7. Login\n" +
                "8. Exit\n" +
                "\nPlease select an option from above:\n", outContent.toString());

    }

    @Test
    public void displaysLoggedInMenu(){

        UserLogin.isLoggedIn = true;
        Menu.printMenu();
        assertEquals("\n---------Menu---------\n" +
                "1. Display Books\n" +
                "2. Display Movies\n" +
                "3. Check-out Books\n" +
                "4. Check-out Movies\n" +
                "5. Return Books\n" +
                "6. Return Movies\n" +
                "7. User Details\n" +
                "8. Logout\n" +
                "9. Exit\n" +
                "\nPlease select an option from above:\n", outContent.toString());

    }


}
