package com.xworkz.isarelation.watch;
public class SmartWatch extends Watch {

    public SmartWatch() {
        super();
        System.out.println("SmartWatch constructor is running - subclass");
    }

    @Override
    public void showTime() {
        System.out.println("SmartWatch showing time with digital display - subclass");
    }

    @Override
    public void setAlarm() {
        System.out.println("SmartWatch setting vibration alarm - subclass");
    }

    @Override
    public void stopWatch() {
        System.out.println("SmartWatch stopwatch with lap timing - subclass");
    }

    @Override
    public void displayDate() {
        System.out.println("SmartWatch displaying full calendar - subclass");
    }
}
