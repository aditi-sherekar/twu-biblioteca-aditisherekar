package com.twu.biblioteca;

import java.util.Iterator;
import java.util.Scanner;

public class ReturnMovie implements ExcuteOptions {



    @Override
    public String displayOptionName() {

        return "Return Movies";
    }

    @Override
    public void excuteOption() {

        if(Library.CheckedOutMovie().size() == 0){
            System.out.println("There are no movies to be returned.");

        }
        else{

            System.out.println("Please enter the movie you wish to return:");
            Scanner optionSelection = new Scanner(System.in);
            String selectedOption = optionSelection.nextLine();

            processMovieReturn(selectedOption);

        }

    }

    public static void processMovieReturn(String optionSelected) {

        Iterator<Movie> checkOutMovieIterator = Library.CheckedOutMovie().iterator();

        while(checkOutMovieIterator.hasNext()){
            Movie movie = checkOutMovieIterator.next();
            if (movie.getMovieTitle().matches(optionSelected)) {
                Library.MovieLibrary().add(movie);
                Library.CheckedOutMovie().remove(movie);
                System.out.println("Thank you for returning the movie.");

            }
            else if (!movie.getMovieTitle().matches(optionSelected) && checkOutMovieIterator.hasNext()) {

                continue;
            }
            else{
                System.out.println("That movie is not valid to return.");
            }

        }

    }
}
