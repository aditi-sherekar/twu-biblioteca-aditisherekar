package com.twu.biblioteca;

public class QuitApp implements ExcuteOptions {

    @Override
    public String displayOptionName(){

        return "Exit";

    }

    @Override
    public void excuteOption(){

        System.out.println("You are now exiting the program: Goodbye!");

    }

}
