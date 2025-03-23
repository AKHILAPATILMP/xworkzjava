package com.xworkz.count.experience;

public class Education {
    String degree;

    Education(String degree) {
        this.degree = degree;
    }

    void display() {
        System.out.println("        Education: " + degree);
    }
}
