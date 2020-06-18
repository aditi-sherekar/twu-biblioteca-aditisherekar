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

        System.out.println("Please select the book you wish to return:");

        Scanner optionSelection = new Scanner(System.in);

        Iterator<Book> checkOutBookIterator = Library.CheckedOutBook().iterator();


        try {

            String selectedOption = optionSelection.nextLine();

            while(checkOutBookIterator.hasNext()){
                Book book = checkOutBookIterator.next();
                if (book.getBookTitle().matches(selectedOption)) {
                    Library.BookLibrary().add(book);
                    Library.CheckedOutBook().remove(book);
                    System.out.println("Thank you for returning the book.");
                }
                else if (!book.getBookTitle().matches(selectedOption) && checkOutBookIterator.hasNext()) {

                    continue;
                }
                else{
                    System.out.println("That book is not valid to return.");
                }

            }




        } catch (InputMismatchException exception) {
            //Print "This is not an integer"
            //when user put other than integer
            System.out.println("This is not an integer, try again!");

        }



    }
}

