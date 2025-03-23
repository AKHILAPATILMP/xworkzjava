package com.xworkz.count.city;

public class City {
    String name;
    Ward[] wards = new Ward[2];

    City(String name) {
        this.name = name;
        wards[0] = new Ward("Ward 1");
        wards[1] = new Ward("Ward 2");
    }

    void display() {
        System.out.println("    City: " + name);
        for (Ward ward : wards) ward.display();
    }
}
