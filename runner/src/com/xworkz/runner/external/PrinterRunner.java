package com.xworkz.runner.external;

import com.xworkz.runner.internal.Printer;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer printer = new Printer("Canon", "Inkjet", 7500);
        String printerString = printer.toString();
        System.out.println("printer" + printerString);
    }
}
