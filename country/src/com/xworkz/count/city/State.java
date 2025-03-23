package com.xworkz.count.city;

public class State {
    String name;
    City[] cities = new City[2];

    public State(String name) {
        this.name = name;
        cities[0] = new City("Bangalore");
        cities[1] = new City("Mysore");
    }

    public void display() {
        System.out.println("  State: " + name);
        for (City city : cities) city.display();
    }
}
