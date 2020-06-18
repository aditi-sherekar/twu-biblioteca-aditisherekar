package com.twu.biblioteca;

import com.twu.biblioteca.Menu;
import org.junit.Before;
import org.junit.Test;

import javax.lang.model.type.TypeMirror;
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
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Banglore!\n", outContent.toString());
    }

    @Test
    public void displaysMenu(){
        Menu.printMenu();
        assertEquals("\n---------Menu---------\n" +
                "1. Display Books\n" +
                "2. Checkout Books\n" +
                "3. Return Books\n" +
                "4. Exit\n" +
                "\nPlease select an option from above:\n", outContent.toString());

    }


}
