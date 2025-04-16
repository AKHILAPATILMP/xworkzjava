package com.xworkz.inherit.singlerun;

import com.xworkz.inherit.single.WirelessCharger;

public class Run10
{
    public static void main(String[] args) {
        WirelessCharger wirelessCharger = new WirelessCharger();
        wirelessCharger.chargeDevice();  // Inherited method from Charger class
        wirelessCharger.chargeWirelessly(); // Method of WirelessCharger class
    }
}
