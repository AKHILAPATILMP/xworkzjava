package com.xworkz.isarelation.violin;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of ElectricViolin using Violin reference");
            Violin violinRef = new ElectricViolin();
            violinRef.play();
            violinRef.tune();
            violinRef.useBow();
            violinRef.pluckStrings();
            violinRef.adjustVolume();

            System.out.println("\nCreating an instance of ElectricViolin using subclass reference");
            ElectricViolin electricViolin = new ElectricViolin();
            electricViolin.play();
            electricViolin.tune();
            electricViolin.useBow();
            electricViolin.pluckStrings();
            electricViolin.adjustVolume();
            electricViolin.connectToAmplifier();
            electricViolin.enableReverbEffect();
            electricViolin.changeToneSettings();
            electricViolin.recordPerformance();
            electricViolin.enableBluetooth();
        }
    }

