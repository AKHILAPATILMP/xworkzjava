package com.xworkz.later.external;

import com.xworkz.later.internal.Printer;

public class PrinterUser {

    Printer printer;

    public PrinterUser(Printer printer) {
        this.printer = printer;
        System.out.println("PrinterUser is initialized");
    }

    public void activate() {
        if (this.printer != null) {
            this.printer.print();
        } else {
            System.out.println("No printer to print");
        }
    }
}
