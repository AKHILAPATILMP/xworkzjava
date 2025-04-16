package com.xworkz.inherit.singlerun;

import com.xworkz.inherit.single.GiraffeNeck;

public class Run4 {
    public static void main(String[] args) {
        GiraffeNeck giraffeNeck = new GiraffeNeck();
        giraffeNeck.supportHead();  // Inherited method from Neck class
        giraffeNeck.reachHigh();    // Method of GiraffeNeck class
    }
}
