package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class CheckOutBook implements ExcuteOptions {

    @Override
    public String displayOptionName() {

        return "Checkout Books";
    }

    @Override
    public void excuteOption()  {

        System.out.println("   | Book Title | Authour | Publication Year |");
        System.out.println(Library.getBookDetails());

        System.out.println("Please select the book you wish to check-out:");


        Scanner optionSelection = new Scanner(System.in);

        Iterator<Book> bookIterator = Library.BookLibrary().iterator();

        String selectedOption = optionSelection.nextLine();

        while(bookIterator.hasNext()) {
            Book book = bookIterator.next();
            if (book.getBookTitle().matches(selectedOption)) {
                Library.BookLibrary().remove(book);
                Library.CheckedOutBook().add(book);
                System.out.println("Thank you! Enjoy the book!");
                return;
            } else if (!book.getBookTitle().matches(selectedOption) && bookIterator.hasNext()) {

                continue;

            } else {
                System.out.println("Sorry, that book is not available!");
            }
        }

    }
}
