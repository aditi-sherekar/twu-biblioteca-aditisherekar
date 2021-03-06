package com.twu.biblioteca;

import java.util.Iterator;
import java.util.Scanner;

public class CheckOutBook implements ExcuteOptions {

    private static String selectedOption = "";

    @Override
    public String displayOptionName() {

        return "Check-out Books";

    }


    @Override
    public void excuteOption()  {

        if (UserLogin.isLoggedIn == true) {
            System.out.println("   | Book Title | Author | Publication Year |");
            if (Library.BookLibrary().size() != 0){
                System.out.print(Library.getBookDetails());
                System.out.println("Please select the book you wish to check-out:");
                Scanner optionSelection = new Scanner(System.in);
                selectedOption = optionSelection.nextLine();
                processBookCheckOut(selectedOption);
            }
            else{
                System.out.println("   |      No books available to check-out      |");
            }

        }
        else{
            UserLogin.getUserInput();
            excuteOption();
        }

    }

    public static void processBookCheckOut(String optionSelected){

        Iterator<Book> bookIterator = Library.BookLibrary().iterator();

        while(bookIterator.hasNext()) {
            Book book = bookIterator.next();
            if (book.getBookTitle().matches(optionSelected)) {
                Library.BookLibrary().remove(book);
                User.addUserBooks(book);
                Library.CheckedOutBook().add(book);
                System.out.println("Thank you! Enjoy the book!");
                return;

            } else if (!book.getBookTitle().matches(optionSelected) && bookIterator.hasNext()) {

                continue;

            } else if (!book.getBookTitle().matches(optionSelected) && !bookIterator.hasNext()){
                System.out.println("Sorry, that book is not available!");
            }
        }

    }

}
