package com.xworkz.isarelation.autocar;

public class Garage {
        public void service(AutoCar autoCar) {
            autoCar.startEngine();
            autoCar.accelerate();
            autoCar.brake();
            autoCar.stopEngine();
            autoCar.motor();

            if (autoCar instanceof AutoCarSystem) {
                System.out.println("Casting to AutoCarSystem to access subclass-specific behavior");
                AutoCarSystem system = (AutoCarSystem) autoCar;
                system.autopilotmode();
            }
        }
    }


