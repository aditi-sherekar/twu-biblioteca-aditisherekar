package com.twu.biblioteca;

import java.util.Iterator;
import java.util.Scanner;

public class UserLogin implements ExcuteOptions {

    public static boolean isLoggedIn = false;

    @Override
    public String displayOptionName(){

        return "Login";

    }

    @Override
    public void excuteOption() {

        getUserInput();
    }

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
                isLoggedIn = true;
                Library.userLoggedInList.add(user);
                System.out.println("You have successfully logged in!");

            }
            else{
                System.out.println("Sorry, the library number or password entered was incorrect. Please try again.");
            }
        }
    }

}
