package com.xworkz.electronics;

import com.xworkz.book.Book;
import com.xworkz.book.Library;

public class Runner {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 450, "James Gosling");
        book.showBook();
        Library library=new Library("Kavyarahasya",20,"1-rack");
        library.showLibrary();
    }
}
