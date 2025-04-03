package com.xworkz.isarelation.machine;

public class Machine {
        public Machine() {
            System.out.println("Machine constructor is running");
        }

        public void start() {
            System.out.println("Machine is starting");
        }

        public void stop() {
            System.out.println("Machine is stopping");
        }

        public void operate() {
            System.out.println("Machine is operating");
        }

        public void maintenance() {
            System.out.println("Machine is under maintenance");
        }

        public void powerSupply() {
            System.out.println("Machine is connected to a power supply");
        }
    }

