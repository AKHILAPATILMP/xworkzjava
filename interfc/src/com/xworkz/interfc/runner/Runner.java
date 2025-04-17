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
        ac.energySaverMode();

        Airplane airplane=new Jet();
        airplane.fly();
        airplane.land();
        airplane.takeOff();
        airplane.landon();

        AirPurifier airPurifier=new SmartAirPurifier();
        airPurifier.adjustSpeed();
        airPurifier.purify();
        airPurifier.replaceFilter();
        airPurifier.clean();

        BarcodeScanner barcodeScanner=new HandheldBarcodeScanner();
        barcodeScanner.reset();
        barcodeScanner.scanBarcode();
        barcodeScanner.connectToSystem();
        barcodeScanner.scan();

        Bed bed=new BedImpli();
        bed.gotup();

        Camera camera=new CameraImpli();
        camera.lens();

        Chair chair=new OfficeChairImpli();
        chair.pull();

        CoffeeMaker coffeeMaker=new EspressoMachine();
        coffeeMaker.makes();

        Computer computer=new DesktopComputerImpli();
        computer.operate();



    }
}
