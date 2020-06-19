package com.twu.biblioteca;

public class Author {

    String author;

    public Author(String name) {

        if (name == ""){
            this.author = "Author Not Given";
        }
        else{
            this.author = name;
        }
    }


    public String getAuthor(){

       return author;

    }


}
