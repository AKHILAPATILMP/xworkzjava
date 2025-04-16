package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Printer;

public class AllInOnePrinterImpli implements Printer {

    @Override
    public void print() {
        System.out.println("All-in-one printer printing");
    }

    @Override
    public void scan() {
        System.out.println("All-in-one printer scanning");
    }

    @Override
    public void copy() {
        System.out.println("All-in-one printer copying");
    }
}
