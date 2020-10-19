package com.twu.biblioteca;

import java.util.Iterator;
import java.util.Scanner;

public class CheckOutMovie implements ExcuteOptions{

    private static String selectedOption = "";

    @Override
    public String displayOptionName() {

        return "Check-out Movies";
    }

    @Override
    public void excuteOption()  {

        if (UserLogin.isLoggedIn == true) {
            System.out.println("   | Movie Title | Director | Release Year |");
            if (Library.MovieLibrary().size() != 0){
                System.out.println("   | Movie Title | Director | Release Year |");
                System.out.println(Library.getMovieDetails());

                System.out.println("Please select the movie you wish to check-out:");

                Scanner optionSelection = new Scanner(System.in);
                selectedOption = optionSelection.nextLine();


                processMovieCheckOut(selectedOption);
            }
            else{
                System.out.println("   |      No movies available to check-out      |");
            }

        }
        else{
            UserLogin.getUserInput();
            excuteOption();
        }
    }

    public static void processMovieCheckOut(String optionSelected){

        Iterator<Movie> movieIterator = Library.MovieLibrary().iterator();

        while(movieIterator.hasNext()) {
            Movie movie = movieIterator.next();
            if (movie.getMovieTitle().matches(optionSelected)) {
                Library.MovieLibrary().remove(movie);
                User.addUserMovies(movie);
                Library.CheckedOutMovie().add(movie);
                System.out.println("Thank you! Enjoy the movie!");
                return;
            } else if (!movie.getMovieTitle().matches(optionSelected) && movieIterator.hasNext()) {

                continue;

            } else if (!movie.getMovieTitle().matches(optionSelected) && !movieIterator.hasNext()){
                System.out.println("Sorry, that movie is not available!");
            }
        }

    }
}
