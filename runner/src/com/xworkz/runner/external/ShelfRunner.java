package com.xworkz.runner.external;

import com.xworkz.runner.internal.Shelf;

public class ShelfRunner {
    public static void main(String[] args) {
        Shelf shelf = new Shelf("Metal", "Black", 1600);
        System.out.println("shelf" + shelf.toString());
    }
}
