package com.xworkz.isarelation.skateboard;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of ElectricSkateboard using Skateboard reference");
            Skateboard skateboardRef = new ElectricSkateboard();
            skateboardRef.ride();
            skateboardRef.turn();
            skateboardRef.stop();
            skateboardRef.ollie();
            skateboardRef.kickflip();

            System.out.println("\nCreating an instance of ElectricSkateboard using subclass reference");
            ElectricSkateboard electricSkateboard = new ElectricSkateboard();
            electricSkateboard.ride();
            electricSkateboard.turn();
            electricSkateboard.stop();
            electricSkateboard.ollie();
            electricSkateboard.kickflip();
            electricSkateboard.accelerate();
            electricSkateboard.brake();
            electricSkateboard.checkBattery();
            electricSkateboard.enableCruiseControl();
            electricSkateboard.connectToApp();
        }
    }

