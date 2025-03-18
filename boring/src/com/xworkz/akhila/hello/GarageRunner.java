package com.xworkz.akhila.hello;

public class GarageRunner {
    public static void main(String[] args) {
        Motor motor=new Motor();
        Garage garage =new Garage();
        garage.use(motor);
    }
}
