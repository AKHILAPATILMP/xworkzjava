package com.xworkz.isarelation.fence;
    public class ElectricFence extends Fence {
        public ElectricFence() {
            super();
            System.out.println("ElectricFence constructor is running");
        }

        public void shockIntruders() {
            System.out.println("ElectricFence: Delivering shock to intruders...");
        }

        public void monitorSecurity() {
            System.out.println("ElectricFence: Monitoring security levels...");
        }

        public void autoRepair() {
            System.out.println("ElectricFence: Self-repairing minor damages...");
        }

        public void solarPowered() {
            System.out.println("ElectricFence: Operating with solar energy...");
        }

        public void alarmSystem() {
            System.out.println("ElectricFence: Triggering alarm on unauthorized access...");
        }
    }

