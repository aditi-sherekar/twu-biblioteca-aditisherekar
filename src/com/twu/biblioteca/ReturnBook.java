package com.twu.biblioteca;

public class ReturnBook implements ExcuteOptions {

    @Override
    public String displayOptionName() {

        return "Return Books";
    }

    @Override
    public void excuteOption(){

        System.out.println("Thank you for returning");

    }
}
