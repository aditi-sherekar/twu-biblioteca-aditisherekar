package com.twu.biblioteca;

public class Login implements ExcuteOptions {

    @Override
    public String displayOptionName(){

        return "Login";

    }

    @Override
    public void excuteOption(){

        UserLogin.getUserInput();
        System.out.println("You have succesfully logged in!");
    }
}
