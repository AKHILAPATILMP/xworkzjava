package com.xworkz.isarelation.tennis;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartTennis using Tennis reference");
            Tennis tennisRef = new SmartTennis();
            tennisRef.serve();
            tennisRef.hitForehand();
            tennisRef.hitBackhand();
            tennisRef.volley();
            tennisRef.spinBall();

            System.out.println("\nCreating an instance of SmartTennis using subclass reference");
            SmartTennis smartTennis = new SmartTennis();
            smartTennis.serve();
            smartTennis.hitForehand();
            smartTennis.hitBackhand();
            smartTennis.volley();
            smartTennis.spinBall();
            smartTennis.trackSwingSpeed();
            smartTennis.measureBallSpin();
            smartTennis.connectToApp();
            smartTennis.analyzePerformance();
            smartTennis.enableGPS();
        }
    }

