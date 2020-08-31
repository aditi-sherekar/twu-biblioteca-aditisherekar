package com.twu.biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.twu.biblioteca.Menu.createOptionsList;

public class BibliotecaApp {

    private final Library library;
    private final Menu menu;

    public BibliotecaApp(Library library, Menu menu) {
        this.library = library;
        this.menu = menu;
    }

    public static void printWelcomeMessage(){

        Menu.printWelcomeMessage();
    }

    public static void printProgrammeMenu(){

        Menu menu = new Menu();

        //Prints Menu
        menu.printMenu();

        //While the programme is running the menu, it asks the user for a number input to select an option
        //If the user selects from options 1-3, that option is executed and then the menu is run again
        //If the user selects option 4, the exit option is executed and the program ends.
        while (true){
            Scanner optionSelection = new Scanner(System.in);

            try
            {
                //nextInt will throw InputMismatchException
                //if the next token does not match the Integer
                //regular expression, or is out of range
                Integer selectedOption = optionSelection.nextInt();
                if (selectedOption >= 1 && selectedOption <= 4){
                    createOptionsList().get(selectedOption - 1).excuteOption();
                    menu.printMenu();
                }
                if(selectedOption == 5){
                    createOptionsList().get(selectedOption - 1).excuteOption();
                    break;
                }
                if(selectedOption <= 0 || selectedOption > 5 ){
                System.out.println("Please select a valid option!");
                menu.printMenu();
            }

            }
            catch(InputMismatchException exception)
            {
                //Print "This is not an integer"
                //when user put other than integer
                System.out.println("This is not an integer, try again!");
                menu.printMenu();
            }


        }

    }

    public static void main(String[] args) {

        Book book1 = new Book(new BookTitle("The Great Gatsby"), new Author("F. Scott Fitzgerald"), new BookYear("1925"));
        Book book2 = new Book(new BookTitle("The Headspace Guide to Meditation & Mindfulness"), new Author("Andy Puddicombe"), new BookYear("2011"));
        Library.addBook(book1);
        Library.addBook(book2);
        Movie movie1 = new Movie(new MovieTitle("Black Panther"), new Director("Ryan Coogler"), new MovieYear("2018"));
        Library.addMovie(movie1);
        //Library.addBook(null);
        //Prints Welcome Message
        printWelcomeMessage();
        printProgrammeMenu();

    }
}
