package com.xworkz.library;

public class Library {

        private String bookName;
        private int bookID;
        private static String libraryName;

        static {
            libraryName = "City Library";
            System.out.println("Static Block Executed: Library Name is set.");
        }
        public Library(String bookName, int bookID) {
            this.bookName = bookName;
            this.bookID = bookID;
        }

        public void showBookDetails() {
            System.out.println("Book: " + bookName + ", ID: " + bookID + ", Library: " + libraryName);
        }
    }


