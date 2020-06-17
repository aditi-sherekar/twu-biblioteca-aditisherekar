package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import static com.twu.biblioteca.Menu.createOptionsList;

public class BibliotecaApp {


    public static void executeMenu(){

        //Prints Menu
        Menu.printMenu();

        //While the programme is running the menu, it asks the user for a number input to select an option
        //If the user selects from options 1-3, that option is executed and then the menu is run again
        //If the user selects option 4, the exit option is executed and the program ends.
        while (true){
            Scanner optionSelection = new Scanner(System.in);
            System.out.println("Please select a number from the option above:");

            Integer selectedOption = optionSelection.nextInt();
            if (selectedOption < 4){
                createOptionsList().get(selectedOption - 1).excuteOption();
                Menu.printMenu();
            }
            if(selectedOption == 4){
                createOptionsList().get(selectedOption - 1).excuteOption();
                break;
            }
        }

    }

    public static void main(String[] args) {

        Book book1 = new Book(new Title("The Great Gatsby"), new Author("Mark"), new Year("1999"));
        Book book2 = new Book(new Title("The Headspace Guide to Meditation & Mindfulness"), new Author("Andy Puddicombe"), new Year("2011"));
        Library.BookLibrary(book1);
        Library.BookLibrary(book2);
        //Prints Welcome Message
        Menu.printWelcomeMessage();
        executeMenu();

    }
}
