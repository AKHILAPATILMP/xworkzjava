package com.xworkz.book;

public class Library {

        public String name;
        int totalBooks;
        private String location;

        public Library(String name, int totalBooks, String location) {
            this.name = name;
            this.totalBooks = totalBooks;
            this.location = location;
        }

        public void showLibrary() {
            System.out.println("Library: " + name + ", Total Books: " + totalBooks);
            showLocation();
        }

        void showTotalBooks() {
            System.out.println("Total Books: " + totalBooks);
        }

        private void showLocation() {
            System.out.println("Location: " + location);
        }
    }


