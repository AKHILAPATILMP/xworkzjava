package com.xworkz.associate;

public class Port {

        private String name="Toca";
        private final int numberOfPorts;
        private PortType portType;

        public Port(String name, int numberOfPorts,PortType portType) {
            this.name = name;
            this.numberOfPorts = numberOfPorts;
            this.portType=portType;
        }

        public void displayPortDetails() {
            System.out.println("Port Name: " + this.name);
            System.out.println("Number of Ports: " + this.numberOfPorts);
            portType.displayPortTypeDetails();
        }
    }