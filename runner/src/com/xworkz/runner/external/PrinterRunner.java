package com.xworkz.runner.external;

import com.xworkz.runner.internal.Printer;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer printer = new Printer("HP", "Laser", 12500.99);
        String printerString = printer.toString();
        System.out.println("Printer details: " + printerString);

        int hash = printer.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "toner";
        String two = "ink";
        String three = "paper";

        System.out.println("toner: " + one.hashCode());
        System.out.println("ink: " + two.hashCode());
        System.out.println("paper: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(printer));
    }
}
