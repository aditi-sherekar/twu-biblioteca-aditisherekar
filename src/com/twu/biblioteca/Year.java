package com.twu.biblioteca;

public class Year {

    String year;

    public Year(String number) {

        if (number == ""){

            this.year = "Publication Year Not Given";
        }
        else {
            this.year = number;
        }

    }


    public String getYear(){

        return this.year;

    }


}
