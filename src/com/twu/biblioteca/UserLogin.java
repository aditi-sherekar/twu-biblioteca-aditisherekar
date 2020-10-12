package com.twu.biblioteca;

import java.util.Iterator;
import java.util.Scanner;

public class UserLogin {

    public static void getUserInput(){
        String numberUserInput = "";
        String passwordUserInput = "";

        System.out.println("Please login to continue.");
        System.out.println("Please enter library number.");
        Scanner libraryNumberInput = new Scanner(System.in);
        numberUserInput = libraryNumberInput.nextLine();
        System.out.println("Please enter password.");
        Scanner passwordInput = new Scanner(System.in);
        passwordUserInput = passwordInput.nextLine();

        processLogin(numberUserInput, passwordUserInput);
    }


    public static void processLogin(String numberUserInput, String passwordUserInput) {

        Iterator<User> userIterator = Library.UserLibrary().iterator();

        while(userIterator.hasNext()) {
            User user = userIterator.next();
            if ((user.getLibraryNumber().matches(numberUserInput)) && (user.getPassword().matches(passwordUserInput))) {
                continue;
            }
            else{
                System.out.println("Sorry, the library number or password entered was incorrect. Please try again.");
                BibliotecaApp.printProgrammeMenu();
            }
        }
    }
}
