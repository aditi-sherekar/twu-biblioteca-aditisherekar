package com.twu.biblioteca;

public class ReturnMovie implements ExcuteOptions {

    @Override
    public String displayOptionName() {

        return "Return Movies";
    }

    @Override
    public void excuteOption() {

        if(Library.CheckedOutMovie().size() == 0){
            System.out.println("There are no movies to be returned.");

        }
        else{

        }


    }
}
