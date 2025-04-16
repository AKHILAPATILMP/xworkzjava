package com.xworkz.inherit.singlerun;

import com.xworkz.inherit.single.EBook;

public class Run9 {
    public static void main(String[] args) {
        EBook eBook = new EBook();
        eBook.read();  // Inherited method from Book class
        eBook.download(); // Method of EBook class
    }
}
