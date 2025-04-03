package com.xworkz.isarelation.cupboard;

public class Runner {

        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartCupboard using Cupboard reference");
            Cupboard cupboardRef = new SmartCupboard();
            cupboardRef.open();
            cupboardRef.close();
            cupboardRef.lock();
            cupboardRef.unlock();

            System.out.println("\nCreating an instance of SmartCupboard using subclass reference");
            SmartCupboard smartCupboard = new SmartCupboard();
            smartCupboard.open();
            smartCupboard.close();
            smartCupboard.lock();
            smartCupboard.unlock();
            smartCupboard.fingerprintLock();
            smartCupboard.voiceControl();
            smartCupboard.autoOpen();
            smartCupboard.smartLighting();
        }
    }

