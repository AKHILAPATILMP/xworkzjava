package com.xworkz.interfc.externali;

public interface BarcodeScanner {
    void scanBarcode();
    void connectToSystem();
    void reset();
    default void scan(){
        System.out.println("scan the barcode");
    }
}
