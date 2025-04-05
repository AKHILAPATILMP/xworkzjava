package com.xworkz.isarelation.shelf;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Shelf");
        Shelf shelf = new Shelf();
        shelf.storeItems();
        shelf.cleanShelf();
        shelf.displayShelfType();
        shelf.organize();

        System.out.println("\nCreating an instance of BookShelf using Shelf reference");
        Shelf shelfRef = new BookShelf();
        shelfRef.storeItems();
        shelfRef.cleanShelf();
        shelfRef.displayShelfType();
        shelfRef.organize();

        System.out.println("\nCreating an instance of BookShelf using subclass reference");
        BookShelf bookShelf = new BookShelf();
        bookShelf.storeItems();
        bookShelf.cleanShelf();
        bookShelf.displayShelfType();
        bookShelf.organize();
    }
}
