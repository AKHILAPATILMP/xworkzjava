package com.xworkz.associate;

public class PortType {

        private String type;
        private double speed;

        public PortType(String type, double speed) {
            this.type = type;
            this.speed = speed;
        }

        public void displayPortTypeDetails() {
            System.out.println("Port Type: " + this.type);
            System.out.println("Data Transfer Speed: " + this.speed + " Gbps");
        }
    }

