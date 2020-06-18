package com.twu.biblioteca;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ReturnBook implements ExcuteOptions {



    @Override
    public String displayOptionName() {

        return "Return Books";
    }

    @Override
    public void excuteOption() {



        Iterator<Book> checkOutBookIterator = Library.CheckedOutBook().iterator();


        if(Library.CheckedOutBook().size() == 0){
            System.out.println("There are no books to be returned.");
        }
        else{
            System.out.println("Please select the book you wish to return:");
            Scanner optionSelection = new Scanner(System.in);
            String selectedOption = optionSelection.nextLine();
            while(checkOutBookIterator.hasNext()){
                Book book = checkOutBookIterator.next();
                if (book.getBookTitle().matches(selectedOption)) {
                    Library.BookLibrary().add(book);
                    Library.CheckedOutBook().remove(book);
                    System.out.println("Thank you for returning the book.");
                    return;
                }
                else if (!book.getBookTitle().matches(selectedOption) && checkOutBookIterator.hasNext()) {

                    continue;

                }
                else{
                    System.out.println("That book is not valid to return.");
                }

            }
        }




    }
}

