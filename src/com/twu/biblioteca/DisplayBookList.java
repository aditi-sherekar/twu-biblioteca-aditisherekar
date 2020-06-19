package com.twu.biblioteca;


public class DisplayBookList implements ExcuteOptions {


    @Override
    public String displayOptionName() {

        return "Display Books";
    }


    @Override
    public void excuteOption(){

        System.out.println("   | Book Title | Author | Publication Year |");
        if (Library.BookLibrary().size() != 0){
            System.out.print(Library.getBookDetails());
        }
        else{
            System.out.print("   |      No books available to display      |");
        }

    }
}
