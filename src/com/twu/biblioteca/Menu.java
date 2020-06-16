package com.twu.biblioteca;

public class Menu {


    public static void printWelcomeMessage() {

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Banglore!");
    }

    public static void printMenu() {

        System.out.println("---------Menu---------");
        for (int index = 0; index < Options.createOptionsList().size(); index++){

            System.out.println(index + "." + " " + Options.createOptionsList().get(index).displayName);

        }



    }
}
