package com.xworkz.runner.external;

import com.xworkz.runner.internal.Shelf;

public class ShelfRunner {
    public static void main(String[] args) {
        Shelf shelf = new Shelf("Wood", 4, true);
        String shelfString = shelf.toString();
        System.out.println("Shelf details: " + shelfString);

        int hash = shelf.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "rack";
        String two = "book";
        String three = "storage";

        System.out.println("rack: " + one.hashCode());
        System.out.println("book: " + two.hashCode());
        System.out.println("storage: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(shelf));
    }
}
