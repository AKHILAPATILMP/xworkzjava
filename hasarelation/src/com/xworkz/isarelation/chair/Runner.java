package com.xworkz.isarelation.chair;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartChair using Chair reference");
            Chair chairRef = new SmartChair();
            chairRef.sit();
            chairRef.adjustHeight();
            chairRef.rotate();
            chairRef.fold();

            System.out.println("\nCreating an instance of SmartChair using subclass reference");
            SmartChair smartChair = new SmartChair();
            smartChair.sit();
            smartChair.adjustHeight();
            smartChair.rotate();
            smartChair.fold();
            smartChair.massage();
            smartChair.heatControl();
            smartChair.voiceControl();
            smartChair.autoRecline();
        }
    }

