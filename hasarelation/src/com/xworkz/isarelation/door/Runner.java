package com.xworkz.isarelation.door;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Door");
        Door door = new Door();
        door.open();
        door.close();
        door.lock();
        door.unlock();

        System.out.println("\nCreating an instance of AutomaticDoor using Door reference");
        Door doorRef = new AutomaticDoor();
        doorRef.open();
        doorRef.close();
        doorRef.lock();
        doorRef.unlock();

        System.out.println("\nCreating an instance of AutomaticDoor using subclass reference");
        AutomaticDoor autoDoor = new AutomaticDoor();
        autoDoor.open();
        autoDoor.close();
        autoDoor.lock();
        autoDoor.unlock();
    }
}

