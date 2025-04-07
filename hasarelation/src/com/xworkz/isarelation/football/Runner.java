package com.xworkz.isarelation.football;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Football:");
        Football baseBall = new Football();
        baseBall.kick();
        baseBall.pass();
        baseBall.bounce();
        baseBall.inflate();
        baseBall.deflate();

        System.out.println("\nCreating instance of SmartFootball using parent reference:");
        Football smartRef = new SmartFootball();
        smartRef.kick();
        smartRef.pass();
        smartRef.bounce();
        smartRef.inflate();
        smartRef.deflate();

        System.out.println("\nCreating instance of SmartFootball using subclass reference:");
        SmartFootball smart = new SmartFootball();
        smart.kick();
        smart.pass();
        smart.bounce();
        smart.inflate();
        smart.deflate();
        smart.connectBluetooth();

        System.out.println("\nUsing FootballSystem to analyze:");
        FootballSystem system = new FootballSystem();
        system.analyze(baseBall);
        system.analyze(smartRef);
        system.analyze(smart);
    }
}
