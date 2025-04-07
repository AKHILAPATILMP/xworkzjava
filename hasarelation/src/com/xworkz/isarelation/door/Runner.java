package com.xworkz.isarelation.door;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Door");
        Door door = new Door();
        door.open();
        door.close();
        door.lock();
        door.unlock();
        door.knock();

        System.out.println("\nCreating an instance of SmartDoor using Door reference");
        Door doorRef = new SmartDoor();
        doorRef.open();
        doorRef.close();
        doorRef.lock();
        doorRef.unlock();
        doorRef.knock();

        System.out.println("\nCreating an instance of SmartDoor using subclass reference");
        SmartDoor smart = new SmartDoor();
        smart.open();
        smart.close();
        smart.lock();
        smart.unlock();
        smart.knock();
        smart.faceRecognition();

        System.out.println("\nUsing SecurityPanel for casting and verification");
        SecurityPanel panel = new SecurityPanel();
        panel.authenticate(door);
        panel.authenticate(doorRef);
        panel.authenticate(smart);
    }
}
