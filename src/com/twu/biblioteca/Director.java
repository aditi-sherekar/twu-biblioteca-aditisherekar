package com.twu.biblioteca;

public class Director {

    String director;

    public Director(String name) {

        if (name == ""){
            this.director = "Director Not Given";
        }
        else{
            this.director = name;
        }
    }


    public String getDirector(){

        return director;

    }


}