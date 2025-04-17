package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.BarcodeScanner;

public class HandheldBarcodeScanner implements BarcodeScanner {

    @Override
    public void scanBarcode() {
        System.out.println("Scanning the barcode...");
    }

    @Override
    public void connectToSystem() {
        System.out.println("Connecting barcode scanner to the system...");
    }

    @Override
    public void reset() {
        System.out.println("Resetting the barcode scanner to default settings...");
    }

    @Override
    public void scan() {
        System.out.println("scan the barcode");
    }
}
