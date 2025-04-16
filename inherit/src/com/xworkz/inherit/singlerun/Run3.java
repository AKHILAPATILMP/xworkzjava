package com.xworkz.inherit.singlerun;

import com.xworkz.inherit.single.PlasticBottle;

public class Run3 {
    public static void main(String[] args) {
        PlasticBottle plasticBottle = new PlasticBottle();
        plasticBottle.holdLiquid();  // Inherited method from Bottle class
        plasticBottle.isReusable();  // Method of PlasticBottle class
    }
}
