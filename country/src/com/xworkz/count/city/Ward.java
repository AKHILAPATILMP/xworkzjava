package com.xworkz.count.city;

public class Ward {
    String name;

    Ward(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("      Ward: " + name);
    }
}
