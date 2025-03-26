package com.xworkz.library;

public class Library {

        private String bookName;
        private int bookID;

        // Static variable (shared across all objects)
        private static String libraryName;

        // Static block (executes once when class is loaded)
        static {
            libraryName = "City Library";
            System.out.println("Static Block Executed: Library Name is set.");
        }

        // Constructor
        public Library(String bookName, int bookID) {
            this.bookName = bookName;
            this.bookID = bookID;
        }

        public void showBookDetails() {
            System.out.println("Book: " + bookName + ", ID: " + bookID + ", Library: " + libraryName);
        }
    }


