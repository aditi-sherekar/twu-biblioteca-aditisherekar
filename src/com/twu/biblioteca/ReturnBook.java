package com.twu.biblioteca;

import java.util.Iterator;
import java.util.Scanner;

public class ReturnBook implements ExcuteOptions {



    @Override
    public String displayOptionName() {

        return "Return Books";
    }

    @Override
    public void excuteOption() {

        if (UserLogin.isLoggedIn == true) {
            if(Library.CheckedOutBook().size() == 0){
                System.out.println("There are no books to be returned.");

            }
            else{
                System.out.println("Please enter the book you wish to return:");
                Scanner optionSelection = new Scanner(System.in);
                String selectedOption = optionSelection.nextLine();

                processBookReturn(selectedOption);
            }

        }
        else{
            UserLogin.getUserInput();
            excuteOption();
        }

    }

    public static void processBookReturn(String optionSelected){

        Iterator<Book> checkOutBookIterator = User.userBookList.iterator();

        while(checkOutBookIterator.hasNext()){
            Book book = checkOutBookIterator.next();
            if (book.getBookTitle().matches(optionSelected)) {
                Library.BookLibrary().add(book);
                Library.CheckedOutBook().remove(book);
                User.removeUserBooks(book);
                System.out.println("Thank you for returning the book.");

            }
            else if (!book.getBookTitle().matches(optionSelected) && checkOutBookIterator.hasNext()) {

                continue;
            }
            else{
                System.out.println("That book is not valid to return.");
            }

        }

    }
}

