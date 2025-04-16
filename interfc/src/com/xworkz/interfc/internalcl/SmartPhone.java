package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Phone;

public class SmartPhone implements Phone {
    public void sendMessage() {
        System.out.println("Sending a message from smartphone...");
    }

    @Override
    public void call() {
        System.out.println("call");
    }

    @Override
    public void text() {
        System.out.println("text");
    }

    @Override
    public void browse() {
        System.out.println("browser");
    }
}