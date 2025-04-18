package com.xowrkz.prep.prep1;
//copy constructor
public class Book {
    String title;
    Book(String t) {
        title = t;
    }
    // Copy constructor
    Book(Book b) {
        title = b.title;
    }

    void display() {
        System.out.println("Book title: " + title);

    }
}