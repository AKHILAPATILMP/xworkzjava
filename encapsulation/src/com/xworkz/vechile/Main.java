package com.xworkz.vechile;

public class Main {
    public static void main(String[] args) {
                Car car = new Car("Toyota", 80);

                // Accessing private data using getter
                System.out.println("Car Brand: " + car.getBrand());
                System.out.println("Car Speed: " + car.getSpeed() + " km/h");

                // Modifying private data using setter
                car.setSpeed(100);

                car.showCarDetails();
            }
        }



