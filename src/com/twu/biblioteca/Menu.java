package com.twu.biblioteca;

import java.util.LinkedList;
import java.util.List;

public class Menu {

    public static List<ExcuteOptions> optionsList;


    public static List<ExcuteOptions> createOptionsList() {
        optionsList = new LinkedList<>();

        optionsList.add(new DisplayBookList());
        optionsList.add(new DisplayMovieList());
        optionsList.add(new CheckOutBook());
        optionsList.add(new CheckOutMovie());
        optionsList.add(new ReturnBook());
        optionsList.add(new ReturnMovie());
        optionsList.add(new Login());
        UserLogin.addMenuOption();
        optionsList.add(new QuitApp());

        return optionsList;
    }


    public static void printWelcomeMessage() {

        System.out.println("\nWelcome to Biblioteca. Your one-stop-shop for great book titles in Banglore!");
    }

    public static void printMenu() {

        System.out.println("\n---------Menu---------");
        for (int index = 0; index < createOptionsList().size(); index++) {

            System.out.println((index + 1) + "." + " " + createOptionsList().get(index).displayOptionName());

        }
        System.out.println("\nPlease select an option from above:");
    }
}
