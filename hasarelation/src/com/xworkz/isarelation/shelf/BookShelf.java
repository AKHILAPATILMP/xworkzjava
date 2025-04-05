package com.xworkz.isarelation.shelf;
public class BookShelf extends Shelf {

    public BookShelf() {
        super();
        System.out.println("BookShelf constructor is running - subclass");
    }

    @Override
    public void storeItems() {
        System.out.println("Storing books on the bookshelf - subclass");
    }

    @Override
    public void cleanShelf() {
        System.out.println("Cleaning bookshelf with soft cloth - subclass");
    }

    @Override
    public void displayShelfType() {
        System.out.println("This is a wooden bookshelf - subclass");
    }

    @Override
    public void organize() {
        System.out.println("Organizing books by genre - subclass");
    }
}
