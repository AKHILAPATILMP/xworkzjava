package com.xworkz.isarelation.printer;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Printer");
        Printer printer = new Printer();
        printer.printDocument();
        printer.scanDocument();
        printer.copyDocument();
        printer.showPrinterStatus();

        System.out.println("\nCreating an instance of SmartPrinter using Printer reference");
        Printer printerRef = new SmartPrinter();
        printerRef.printDocument();
        printerRef.scanDocument();
        printerRef.copyDocument();
        printerRef.showPrinterStatus();

        System.out.println("\nCreating an instance of SmartPrinter using subclass reference");
        SmartPrinter smartPrinter = new SmartPrinter();
        smartPrinter.printDocument();
        smartPrinter.scanDocument();
        smartPrinter.copyDocument();
        smartPrinter.showPrinterStatus();
    }
}
