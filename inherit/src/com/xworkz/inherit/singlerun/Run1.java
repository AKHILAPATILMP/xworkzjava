package com.xworkz.inherit.singlerun;

import com.xworkz.inherit.single.Backpack;

public class Run1 {
    public static void main(String[] args) {
        Backpack backpack = new Backpack();
        backpack.carry();  // Inherited method from Bag class
        backpack.open();   // Method of Backpack class
    }
}
