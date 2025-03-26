package com.xworkz.library;

public class Main {
    public static void main(String[] args) {
        Library book1 = new Library("Java Programming", 101);
        Library book2 = new Library("Python Basics", 102);

        book1.showBookDetails();
        book2.showBookDetails();
    }
}
