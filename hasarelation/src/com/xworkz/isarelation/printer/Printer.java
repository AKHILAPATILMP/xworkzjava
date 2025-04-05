package com.xworkz.isarelation.printer;

public class Printer {

    public Printer() {
        System.out.println("Printer constructor is running - parent class");
    }

    public void printDocument() {
        System.out.println("Printing document - parent class");
    }

    public void scanDocument() {
        System.out.println("Scanning document - parent class");
    }

    public void copyDocument() {
        System.out.println("Copying document - parent class");
    }

    public void showPrinterStatus() {
        System.out.println("Printer is online - parent class");
    }
}
