package com.twu.biblioteca;

import java.util.Iterator;

public class UserDetails implements ExcuteOptions {

    @Override
    public String displayOptionName(){

        return "User Details";

    }

    @Override
    public void excuteOption(){

        printUserDetails();

    }

    public static void printUserDetails(){

        if(UserLogin.isLoggedIn == true) {

            System.out.println("User Details\n");

            String bookName = "";

            Iterator<User> userIterator = Library.UserLoggedInLibrary().iterator();

            while (userIterator.hasNext()) {
                User user = userIterator.next();
                for (int i = 0; i < User.userBookList.size(); i++) {
                    bookName += user.getUserBooks().get(i).getBookTitle() + ", ";
                }


                System.out.println("Name: " + user.getName());
                System.out.println("Library Number: " + user.getLibraryNumber());
                System.out.println("Email: " + user.getEmail());
                System.out.println("Phone Number: " + user.getPhoneNumber());
                System.out.println("Checked-out Books: " + bookName);

            }

        }
    }

}
