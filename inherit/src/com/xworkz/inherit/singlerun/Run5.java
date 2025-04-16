package com.xworkz.inherit.singlerun;

import com.xworkz.inherit.single.CottonCloth;

public class Run5 {
    public static void main(String[] args) {
        CottonCloth cottonCloth = new CottonCloth();
        cottonCloth.coverBody();  // Inherited method from Cloth class
        cottonCloth.softAndBreezy(); // Method of CottonCloth class
    }
}
