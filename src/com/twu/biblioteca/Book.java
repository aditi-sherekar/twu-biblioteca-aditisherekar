package com.twu.biblioteca;

public class Book {


    private final Title title;
    private final Author author;
    private final BookYear year;

    public Book(Title title, Author author, BookYear year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getBookTitle() {

        return this.title.getTitle();
    }

    public String getBookAuthor() {
        return this.author.getAuthor();
    }

    public String getBookYear() {

        return this.year.getYear();
    }


}
