package com.twu.biblioteca;

public class MovieYear {

    String year;

    public MovieYear(String number) {

        if (number == ""){

            this.year = "Release Year Not Given";
        }
        else {
            this.year = number;
        }

    }


    public String getMovieYear(){

        return this.year;

    }


}