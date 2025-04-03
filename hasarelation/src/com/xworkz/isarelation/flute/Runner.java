package com.xworkz.isarelation.flute;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of ElectricFlute using Flute reference");
            Flute fluteRef = new Flutecolor();
            fluteRef.play();
            fluteRef.tune();
            fluteRef.blowAir();
            fluteRef.adjustPitch();
            fluteRef.cleanFlute();

            System.out.println("\nCreating an instance of ElectricFlute using subclass reference");
            Flutecolor electricFlute = new Flutecolor();
            electricFlute.play();
            electricFlute.tune();
            electricFlute.blowAir();
            electricFlute.adjustPitch();
            electricFlute.cleanFlute();
            electricFlute.connectToAmplifier();
            electricFlute.enableReverbEffect();
            electricFlute.changeToneSettings();
            electricFlute.recordPerformance();
            electricFlute.enableBluetooth();
        }
    }

