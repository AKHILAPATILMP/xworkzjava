package com.xworkz.isarelation.football;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartFootball using Football reference");
            Football footballRef = new SmartFootball();
            footballRef.kick();
            footballRef.pass();
            footballRef.dribble();
            footballRef.shoot();
            footballRef.inflate();

            System.out.println("\nCreating an instance of SmartFootball using subclass reference");
            SmartFootball smartFootball = new SmartFootball();
            smartFootball.kick();
            smartFootball.pass();
            smartFootball.dribble();
            smartFootball.shoot();
            smartFootball.inflate();
            smartFootball.trackSpeed();
            smartFootball.measureImpact();
            smartFootball.connectToApp();
            smartFootball.provideTrainingTips();
            smartFootball.enableGPS();
        }
    }

