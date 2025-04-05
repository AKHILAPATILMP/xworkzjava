package com.xworkz.isarelation.watch;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Watch");
        Watch watch = new Watch();
        watch.showTime();
        watch.setAlarm();
        watch.stopWatch();
        watch.displayDate();

        System.out.println("\nCreating an instance of SmartWatch using Watch reference");
        Watch watchRef = new SmartWatch();
        watchRef.showTime();
        watchRef.setAlarm();
        watchRef.stopWatch();
        watchRef.displayDate();

        System.out.println("\nCreating an instance of SmartWatch using subclass reference");
        SmartWatch smartWatch = new SmartWatch();
        smartWatch.showTime();
        smartWatch.setAlarm();
        smartWatch.stopWatch();
        smartWatch.displayDate();
    }
}


