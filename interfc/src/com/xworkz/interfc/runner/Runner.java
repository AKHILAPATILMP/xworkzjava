package com.xworkz.interfc.runner;

import com.xworkz.interfc.externali.*;
import com.xworkz.interfc.internalcl.*;

public class Runner {
    public static void main(String[] args) {
        FanCooler fanCooler=new AirCooler();
        fanCooler.adjustSpeed();
        fanCooler.cool();
        fanCooler.oscillate();

        AC ac=new SmartAC();
        ac.adjustTemperature();
        ac.heat();
        ac.cool();

        Airplane airplane=new Jet();
        airplane.fly();
        airplane.land();
        airplane.takeOff();

        AirPurifier airPurifier=new SmartAirPurifier();
        airPurifier.adjustSpeed();
        airPurifier.purify();
        airPurifier.replaceFilter();

        BarcodeScanner barcodeScanner=new HandheldBarcodeScanner();
        barcodeScanner.reset();
        barcodeScanner.scanBarcode();
        barcodeScanner.connectToSystem();


    }
}
