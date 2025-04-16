package com.xworkz.inherit.multirun;

import com.xworkz.inherit.multi.ScienceTextBook;

public class Run {
    public static void main(String[] args) {
        ScienceTextBook science = new ScienceTextBook();
        science.read();       // Inherited from Book
        science.subject();    // Inherited from TextBook
        science.experiment(); // Own method
    }
}
