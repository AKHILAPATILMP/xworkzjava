package com.xworkz.isarelation.bike;

public class BikeServiceCenter {

    public void service(Bike bike) {
        bike.start();
        bike.accelerate();
        bike.applyBrake();
        bike.honk();
        bike.stop();

        if (bike instanceof SportBike) {
            System.out.println("Casting: bike is an instance of SportBike");
            SportBike sport = (SportBike) bike;
            sport.boostMode();
        }
    }
}
