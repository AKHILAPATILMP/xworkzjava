package com.xworkz.later.internal;

public class ModemImpl implements Modem {

    public ModemImpl() {
        super();
        System.out.println("ModemImpl constructor running");
    }

    @Override
    public void connect() {
        System.out.println("Modem is connecting...");
    }
}
