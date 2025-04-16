package com.xworkz.inherit.hierun;

import com.xworkz.inherit.hierarchial.Bus;
import com.xworkz.inherit.hierarchial.Car;
import com.xworkz.inherit.hierarchial.Vehicle;

public class Main {

        public static void main(String[] args) {
            // Creating objects of subclasses
            Car car = new Car();
            car.start(); // Inherited from Vehicle class
            car.honk();  // Method of Car class

            Vehicle bike = new Vehicle();
            bike.start(); // Inherited from Vehicle class
            bike.stop(); // Method of Bike class

            Bus bus = new Bus();
            bus.start(); // Inherited from Vehicle class
            bus.openDoors(); // Method of Bus class
        }
    }

