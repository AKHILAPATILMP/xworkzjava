package com.xworkz.inherit.singlerun;

import com.xworkz.inherit.single.KingSizeBed;

public class Run8 {
    public static void main(String[] args) {
        KingSizeBed kingSizeBed = new KingSizeBed();
        kingSizeBed.provideComfort();  // Inherited method from Bed class
        kingSizeBed.spacious();        // Method of KingSizeBed class
    }
}
