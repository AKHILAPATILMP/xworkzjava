package com.xworkz.isarelation.wall;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Wall");
        Wall wall = new Wall();
        wall.build();
        wall.paint();
        wall.demolish();
        wall.maintain();

        System.out.println("\nCreating an instance of SmartWall using Wall reference");
        Wall wallRef = new SmartWall();
        wallRef.build();
        wallRef.paint();
        wallRef.demolish();
        wallRef.maintain();

        System.out.println("\nCreating an instance of SmartWall using subclass reference");
        SmartWall smartWall = new SmartWall();
        smartWall.build();
        smartWall.paint();
        smartWall.demolish();
        smartWall.maintain();
    }
}


