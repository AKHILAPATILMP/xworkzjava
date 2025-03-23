package com.xworkz.count.city;

public class Room {
    String type;

    Room(String type) {
        this.type = type;
    }

    void display() {
        System.out.println("Room: " +type);
    }

}
