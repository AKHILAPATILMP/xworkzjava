package com.xworkz.vechile;

public class Car {
    private String brand;
    private int speed;
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative!");
        }
    }

    public void showCarDetails() {
        System.out.println("Car Brand: " + brand + ", Speed: " + speed + " km/h");
    }

}
