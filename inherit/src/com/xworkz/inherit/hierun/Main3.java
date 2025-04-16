package com.xworkz.inherit.hierun;

import com.xworkz.inherit.hierarchial.GamingLaptop;
import com.xworkz.inherit.hierarchial.BusinessLaptop;
import com.xworkz.inherit.hierarchial.Ultrabook;
import com.xworkz.inherit.hierarchial.Laptop;

public class Main3 { 
    public static void main(String[] args) {
        // Creating objects of subclasses

        // GamingLaptop
        GamingLaptop gamingLaptop = new GamingLaptop();
        gamingLaptop.powerOn();      // Inherited from Laptop class
        gamingLaptop.runGames();     // Method of GamingLaptop class

        // BusinessLaptop
        BusinessLaptop businessLaptop = new BusinessLaptop();
        businessLaptop.powerOn();   // Inherited from Laptop class
        businessLaptop.runBusinessApps(); // Method of BusinessLaptop class

        // Ultrabook
        Ultrabook ultrabook = new Ultrabook();
        ultrabook.powerOn();        // Inherited from Laptop class
        ultrabook.longBatteryLife(); // Method of Ultrabook class
    }
}
