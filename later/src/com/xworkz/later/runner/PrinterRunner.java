package com.xworkz.later.runner;

import com.xworkz.later.internal.Printer;
import com.xworkz.later.internal.PrinterImpl;
import com.xworkz.later.external.PrinterUser;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();
        PrinterUser printerUser = new PrinterUser(printer); // abstraction
        printerUser.activate();
    }
}
