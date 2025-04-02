package com.xworkz.isarelation.drone;

    public class MilitaryDrone extends Drone {
        public MilitaryDrone() {
            super();
            System.out.println("MilitaryDrone constructor is running");
        }

        public void stealthMode() {
            System.out.println("MilitaryDrone is in stealth mode");
        }

        public void fireMissile() {
            System.out.println("MilitaryDrone is firing a missile");
        }

        public void nightVision() {
            System.out.println("MilitaryDrone is using night vision cameras");
        }

        public void remoteControl() {
            System.out.println("MilitaryDrone is being controlled remotely");
        }

        public void jamSignals() {
            System.out.println("MilitaryDrone is jamming enemy signals");
        }
    }


