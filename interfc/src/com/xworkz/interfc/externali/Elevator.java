package com.xworkz.interfc.externali;

public interface Elevator {
    void moveUp();
    void moveDown();
    void openDoors();
    default void closedoor(){
        System.out.println("close the door");
    }
}
