package com.xworkz.isarelation.watch;

public class Runner {

        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartWatch using Watch reference");
            Watch watchRef = new SmartWatch();
            watchRef.showTime();
            watchRef.showDate();
            watchRef.setAlarm();
            watchRef.stopwatch();
            watchRef.timer();

            System.out.println("\nCreating an instance of SmartWatch using subclass reference");
            SmartWatch smartWatch = new SmartWatch();
            smartWatch.showTime();
            smartWatch.showDate();
            smartWatch.setAlarm();
            smartWatch.stopwatch();
            smartWatch.timer();
            smartWatch.connectToWiFi();
            smartWatch.trackHeartRate();
            smartWatch.receiveCalls();
            smartWatch.playMusic();
            smartWatch.trackFitness();
        }
    }

