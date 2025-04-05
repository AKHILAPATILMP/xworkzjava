package com.xworkz.isarelation.printer;
public class SmartPrinter extends Printer {

    public SmartPrinter() {
        super();
        System.out.println("SmartPrinter constructor is running - subclass");
    }

    @Override
    public void printDocument() {
        System.out.println("SmartPrinter is printing via Wi-Fi - subclass");
    }

    @Override
    public void scanDocument() {
        System.out.println("SmartPrinter is scanning and sending to email - subclass");
    }

    @Override
    public void copyDocument() {
        System.out.println("SmartPrinter is copying with high resolution - subclass");
    }

    @Override
    public void showPrinterStatus() {
        System.out.println("SmartPrinter is connected to cloud - subclass");
    }
}
