package com.twu.biblioteca;
import java.util.LinkedList;
import java.util.List;

public class Options {

    public static List<Options> optionsList;

    public static List<Options> createOptionsList(){
        this.optionsList = new LinkedList<>();
        this.optionsList.add(new DisplayBookList());
        this.optionsList.add(new CheckOutBook());
        this.optionsList.add(new ReturnBook());
        this.optionsList.add(new QuitApp());

        return optionsList;
    }
}
