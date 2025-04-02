package com.xworkz.isarelation.printer;

public class Runner {

        public static void main(String[] args) {
            System.out.println("Creating an instance of Printer");
            Printer printer = new Printer();
            printer.print();
            printer.scan();
            printer.copy();
            printer.connectToWiFi();
            printer.checkInkLevels();

            System.out.println("\nCreating an instance of LaserPrinter using Printer reference");
            Printer printerRef = new LaserPrinter();
            printerRef.print();
            printerRef.scan();
            printerRef.copy();
            printerRef.connectToWiFi();
            printerRef.checkInkLevels();

            System.out.println("\nCreating an instance of LaserPrinter using subclass reference");
            LaserPrinter laserPrinter = new LaserPrinter();
            laserPrinter.print();
            laserPrinter.scan();
            laserPrinter.copy();
            laserPrinter.connectToWiFi();
            laserPrinter.checkInkLevels();
            laserPrinter.printFast();
            laserPrinter.duplexPrinting();
            laserPrinter.tonerSavingMode();
            laserPrinter.wirelessPrinting();
            laserPrinter.autoShutdown();
        }
    }

