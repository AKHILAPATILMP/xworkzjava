package com.xworkz.later.internal;

public class ScannerImpl implements Scanner {

    public ScannerImpl() {
        super();
        System.out.println("ScannerImpl constructor running");
    }

    @Override
    public void scan() {
        System.out.println("Scanner is scanning...");
    }
}
