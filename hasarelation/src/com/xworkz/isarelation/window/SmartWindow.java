package com.xworkz.isarelation.window;

public class SmartWindow extends Window {

    public SmartWindow() {
        super();
        System.out.println("SmartWindow constructor is running - subclass");
    }

    @Override
    public void open() {
        System.out.println("Opening the window using a remote - subclass");
    }

    @Override
    public void close() {
        System.out.println("Automatically closing the smart window - subclass");
    }

    @Override
    public void lock() {
        System.out.println("Smart locking the window - subclass");
    }

    @Override
    public void clean() {
        System.out.println("Smart window self-cleaning - subclass");
    }
}


