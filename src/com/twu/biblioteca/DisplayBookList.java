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

        System.out.println("   | Book Title | Authour | Publication Year |");
        if (Library.BookLibrary().size() != 0){
            System.out.print(Library.getBookDetails());
        }
        else{
            System.out.print("   |      No books available to display      |");
        }

    }
}
