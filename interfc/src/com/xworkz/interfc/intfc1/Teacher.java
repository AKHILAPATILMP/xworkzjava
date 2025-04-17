package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.AirPurifier;
import com.xworkz.interfc.externali.BarcodeScanner;

public class Teacher implements AirPurifier, BarcodeScanner {
    @Override
    public void purify() {
        System.out.println("purify");

    }

    @Override
    public void replaceFilter() {
        System.out.println("replace it");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("adjust");
    }

    @Override
    public void scanBarcode() {
        System.out.println("scan bar");
    }

    @Override
    public void connectToSystem() {
        System.out.println("connect");
    }

    @Override
    public void reset() {
        System.out.println("reset");
    }
}
