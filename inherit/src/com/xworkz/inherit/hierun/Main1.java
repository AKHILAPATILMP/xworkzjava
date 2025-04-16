package com.xworkz.inherit.hierun;

import com.xworkz.inherit.hierarchial.Machine;
import com.xworkz.inherit.hierarchial.WashingMachine;
import com.xworkz.inherit.hierarchial.Refrigerator;
import com.xworkz.inherit.hierarchial.Microwave;

public class Main1 { 
    public static void main(String[] args) {
        // Creating objects of subclasses

        // WashingMachine
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.start();       // Inherited from Machine class
        washingMachine.washClothes(); // Method of WashingMachine class

        // Refrigerator
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.start();        // Inherited from Machine class
        refrigerator.coolItems();    // Method of Refrigerator class

        // Microwave
        Microwave microwave = new Microwave();
        microwave.start();           // Inherited from Machine class
        microwave.heatFood();        // Method of Microwave class
    }
}
