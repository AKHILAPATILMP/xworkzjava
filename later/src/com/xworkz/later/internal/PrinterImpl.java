package com.xworkz.later.internal;

public class PrinterImpl implements Printer {

    public PrinterImpl() {
        super();
        System.out.println("PrinterImpl constructor running");
    }

    @Override
    public void print() {
        System.out.println("Printer is printing...");
    }
}
