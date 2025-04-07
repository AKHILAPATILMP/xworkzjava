package com.xworkz.isarelation.football;

public class FootballSystem {
    public void analyze(Football football) {
        football.kick();
        football.pass();
        football.bounce();
        football.inflate();
        football.deflate();

        if (football instanceof SmartFootball) {
            System.out.println("Casting: football is instance of SmartFootball");
            SmartFootball smart = (SmartFootball) football;
            smart.connectBluetooth();
        }
    }
}
