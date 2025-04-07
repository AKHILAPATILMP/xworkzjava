package com.xworkz.isarelation.door;

public class SecurityPanel {

    public void authenticate(Door door) {
        door.knock();
        door.open();
        door.close();
        door.lock();
        door.unlock();

        if (door instanceof SmartDoor) {
            System.out.println("Casting: Door is an instance of SmartDoor");
            SmartDoor smartDoor = (SmartDoor) door;
            smartDoor.faceRecognition();
        }
    }
}
