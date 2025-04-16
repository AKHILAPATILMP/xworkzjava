package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Printer;

public class PrinterImpli implements Printer {
    @Override
    public void print() {
        System.out.println("Printer printing");
    }

    @Override
    public void scan() {
        System.out.println("Printer scanning");
    }

    @Override
    public void copy() {
        System.out.println("Printer copying");
    }
}
