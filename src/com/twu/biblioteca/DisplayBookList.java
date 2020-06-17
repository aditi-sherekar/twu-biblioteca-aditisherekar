package com.twu.biblioteca;


import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class DisplayBookList implements ExcuteOptions {


    @Override
    public String displayOptionName() {

        return "Display Books";
    }



    @Override
    public void excuteOption(){

        System.out.println("| Book Title | Authour | Publication Year |");
        System.out.println(Library.getBookDetails());


    }
}
