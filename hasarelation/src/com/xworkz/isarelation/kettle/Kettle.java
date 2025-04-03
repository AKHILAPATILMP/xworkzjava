package com.xworkz.isarelation.kettle;

public class Kettle {
        public Kettle() {
            System.out.println("Kettle constructor is running");
        }

        public void fill() {
            System.out.println("Kettle is being filled with water");
        }

        public void heat() {
            System.out.println("Kettle is heating the water");
        }

        public void pour() {
            System.out.println("Kettle is pouring hot water");
        }

        public void clean() {
            System.out.println("Kettle is being cleaned");
        }

        public void turnOff() {
            System.out.println("Kettle is turned off");
        }
    }
