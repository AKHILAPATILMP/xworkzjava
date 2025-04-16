package com.xworkz.inherit.singlerun;

import com.xworkz.inherit.single.Smartphone;

public class Run6 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.makeCall();  // Inherited method from Mobile class
        smartphone.browseInternet(); // Method of Smartphone class
    }
}
