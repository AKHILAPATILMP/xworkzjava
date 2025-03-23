package com.xworkz.count.experience;

public class Company {
    String name;

    Company(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("        Company: " + name);
    }
}
