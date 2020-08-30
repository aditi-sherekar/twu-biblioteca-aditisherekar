package com.twu.biblioteca;

public class DisplayMovieList implements ExcuteOptions{

    @Override
    public String displayOptionName() {

        return "Display Movies";
    }


    @Override
    public void excuteOption(){

        System.out.println("   | Movie Title | Director | Release Year |");
        if (Library.MovieLibrary().size() != 0){
            System.out.print(Library.getMovieDetails());
        }
        else{
            System.out.print("   |      No movies available to display      |");
        }

    }
}
