package com.xworkz.count.city;

public class HouseKeep {

        String name = "House Keeping Service";
        Transport transport;

        HouseKeep() {
            transport = new Transport();
        }

        void display() {
            System.out.println("          House Keep: " + name);
            transport.display();
        }
}
