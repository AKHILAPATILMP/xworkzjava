package com.xworkz.isarelation.printer;

    public class LaserPrinter extends Printer {
        public LaserPrinter() {
            super();
            System.out.println("LaserPrinter constructor is running");
        }

        public void printFast() {
            System.out.println("LaserPrinter: Printing at high speed...");
        }

        public void duplexPrinting() {
            System.out.println("LaserPrinter: Printing on both sides of the paper...");
        }

        public void tonerSavingMode() {
            System.out.println("LaserPrinter: Activating toner-saving mode...");
        }

        public void wirelessPrinting() {
            System.out.println("LaserPrinter: Printing wirelessly...");
        }

        public void autoShutdown() {
            System.out.println("LaserPrinter: Automatically shutting down after inactivity...");
        }
    }

