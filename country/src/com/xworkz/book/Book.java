package com.xworkz.book;

public class Book {

        public String title;
        int pages;
        private String author;

        public Book(String title, int pages, String author) {
            this.title = title;
            this.pages = pages;
            this.author = author;
        }

        public void showBook() {
            System.out.println("Book: " + title + ", Pages: " + pages);
            showAuthor();
        }

        void showPages() {
            System.out.println("Pages: " + pages);
        }

        private void showAuthor() {
            System.out.println("Author: " + author);
        }
    }


