package com.xworkz.count.city;

public class House {
    String address = "Modhiji House";
    Room[] rooms = new Room[2];
    HouseKeep[] houseKeeps = new HouseKeep[2];

    public House() {
        rooms[0] = new Room("Living Room");
        rooms[1] = new Room("Meeting Hall");
        houseKeeps[0] = new HouseKeep();
        houseKeeps[1] = new HouseKeep();
    }

    public void display() {
        System.out.println("        House: " + address);
        for (Room room : rooms) room.display();
        for (HouseKeep houseKeep : houseKeeps) houseKeep.display();
    }
}
