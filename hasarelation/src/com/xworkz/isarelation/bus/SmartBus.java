package com.xworkz.isarelation.bus;
    public class SmartBus extends Bus {
        public SmartBus() {
            super();
            System.out.println("SmartBus constructor is running");
        }

        public void gpsNavigation() {
            System.out.println("SmartBus is using GPS navigation");
        }

        public void automaticDoors() {
            System.out.println("SmartBus doors are opening and closing automatically");
        }

        public void electricDrive() {
            System.out.println("SmartBus is running on electric power");
        }

        public void smartTicketing() {
            System.out.println("SmartBus is using smart ticketing system");
        }

        public void passengerCounting() {
            System.out.println("SmartBus is counting passengers automatically");
        }
    }

