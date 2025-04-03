package com.xworkz.isarelation.bed;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartBed using Bed reference");
            Bed bedRef = new SmartBed();
            bedRef.sleep();
            bedRef.adjustHeight();
            bedRef.fold();
            bedRef.move();

            System.out.println("\nCreating an instance of SmartBed using subclass reference");
            SmartBed smartBed = new SmartBed();
            smartBed.sleep();
            smartBed.adjustHeight();
            smartBed.fold();
            smartBed.move();
            smartBed.massage();
            smartBed.temperatureControl();
            smartBed.voiceControl();
            smartBed.autoAdjust();
        }
    }

