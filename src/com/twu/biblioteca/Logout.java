package com.twu.biblioteca;

public class Logout implements ExcuteOptions {

    @Override
    public String displayOptionName(){

        return "Logout";

    }

    @Override
    public void excuteOption(){

        UserLogin.isLoggedIn = false;
        Library.userLoggedInList.clear();

        System.out.println("You have successfully logged out!");
    }
}
