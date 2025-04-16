package com.xworkz.inherit.hierun;

import com.xworkz.inherit.hierarchial.Mobile;
import com.xworkz.inherit.hierarchial.SmartPhone;
import com.xworkz.inherit.hierarchial.FeaturePhone;
import com.xworkz.inherit.hierarchial.GamingPhone;

public class Main5 { 
    public static void main(String[] args) {
        // Creating objects of subclasses

        // SmartPhone
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall();            // Inherited from Mobile class
        smartPhone.browseInternet();      // Method of SmartPhone class
        smartPhone.installApps();         // Method of SmartPhone class

        // FeaturePhone
        FeaturePhone featurePhone = new FeaturePhone();
        featurePhone.makeCall();          // Inherited from Mobile class
        featurePhone.camera();            // Method of FeaturePhone class
        featurePhone.longBatteryLife();   // Method of FeaturePhone class

        // GamingPhone
        GamingPhone gamingPhone = new GamingPhone();
        gamingPhone.makeCall();           // Inherited from Mobile class
        gamingPhone.highPerformance();    // Method of GamingPhone class
        gamingPhone.gameGraphics();       // Method of GamingPhone class
    }
}
