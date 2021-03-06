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
            String movieName = "";

            Iterator<User> userIterator = Library.UserLoggedInLibrary().iterator();

            while (userIterator.hasNext()) {
                User user = userIterator.next();
                for (int i = 0; i < User.userBookList.size(); i++) {
                    if(i > 0){
                        bookName += ", " + user.getUserBooks().get(i).getBookTitle();
                    }
                    else{
                        bookName += user.getUserBooks().get(i).getBookTitle();
                    }
                }

                for (int i = 0; i < User.userMovieList.size(); i++) {
                    if(i > 0){
                        movieName += " , " + user.getUserMovies().get(i).getMovieTitle();
                    }
                    movieName += user.getUserMovies().get(i).getMovieTitle();
                }


                System.out.println("Name: " + user.getName());
                System.out.println("Library Number: " + user.getLibraryNumber());
                System.out.println("Email: " + user.getEmail());
                System.out.println("Phone Number: " + user.getPhoneNumber());
                System.out.println("Checked-out Books: " + bookName);
                System.out.println("Checked-out Movies: " + movieName);
            }

        }
    }

}
