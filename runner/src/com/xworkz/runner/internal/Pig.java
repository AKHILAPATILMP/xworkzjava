package com.xworkz.runner.internal;

public class Pig {
    private String breed;
    private int age;
    private double weight;

    public Pig(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[breed=" + breed + ", age=" + age + ", weight=" + weight + " kg]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 515;
    }
}
