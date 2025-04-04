package com.xworkz.isarelation.bicycle;

    public class SmartBicycle extends Bicycle {

        public SmartBicycle() {
            super();
            System.out.println("SmartBicycle constructor is running - subclass");
        }

        @Override
        public void pedal() {
            System.out.println("Pedaling with electronic assistance - subclass");
        }

        @Override
        public void applyBrakes() {
            System.out.println("Applying automatic braking system - subclass");
        }

        @Override
        public void changeGear() {
            System.out.println("Changing gears automatically - subclass");
        }

        @Override
        public void ringBell() {
            System.out.println("Ringing digital bell with sound variations - subclass");
        }
    }



