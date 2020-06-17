package com.twu.biblioteca;

import java.util.Scanner;

import static com.twu.biblioteca.Menu.createOptionsList;
import static com.twu.biblioteca.Menu.printMenu;

public class BibliotecaApp {

    public static void main(String[] args) {

    Menu.printWelcomeMessage();
    Menu.printMenu();
    while (true){
        Scanner optionSelection = new Scanner(System.in);
        System.out.println("Please select a number from the option above:");

        Integer selectedOption = optionSelection.nextInt();
        if (selectedOption < 4){
            createOptionsList().get(selectedOption - 1).excuteOption();
            Menu.printMenu();
        }
        else{
            createOptionsList().get(selectedOption - 1).excuteOption();
            break;
        }
    }




    }
}
