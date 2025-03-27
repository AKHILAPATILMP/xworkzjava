package com.xworkz.associate;

public class Port {

        private String portType;
        private final int speed;

        public Port(String portType, int speed) {
            this.portType = portType;
            this.speed = speed;
        }

        public String getPortType() {
            return portType;
        }

        public void setPortType(String portType) {
            this.portType = portType;
        }

        public void displayInfo() {
            System.out.println("Port Type: " + portType + ", Speed: " + speed + " Gbps");
        }
    }


