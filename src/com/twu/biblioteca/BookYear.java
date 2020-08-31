package com.twu.biblioteca;

public class BookYear {

    String year;

    public BookYear(String number) {

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
