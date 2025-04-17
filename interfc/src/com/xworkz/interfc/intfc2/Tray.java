package com.xworkz.interfc.intfc2;

import com.xworkz.interfc.externali.*;

public class Tray implements Phone, PopcornMachine, POSSystem, Printer, PrinterScanner {
    @Override
    public void processPayment() {
        System.out.println("running a method");
    }

    @Override
    public void generateReceipt() {
        System.out.println("running a method");
    }

    @Override
    public void trackInventory() {
        System.out.println("running a method");
    }

    @Override
    public void call() {
        System.out.println("running a method");
    }

    @Override
    public void text() {
        System.out.println("running a method");
    }

    @Override
    public void browse() {
        System.out.println("running a method");
    }

    @Override
    public void makePopcorn() {
        System.out.println("running a method");
    }

    @Override
    public void servePopcorn() {
        System.out.println("running a method");
    }

    @Override
    public void cleanMachine() {
        System.out.println("running a method");
    }

    @Override
    public void print() {
        System.out.println("running a method");
    }

    @Override
    public void scan() {
        System.out.println("running a method");
    }

    @Override
    public void copy() {
        System.out.println("running a method");
    }
}
