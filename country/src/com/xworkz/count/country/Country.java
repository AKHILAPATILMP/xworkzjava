package com.xworkz.count.country;


import com.xworkz.count.city.State;
import com.xworkz.count.experience.Security;

public class Country {
    String name = "India";
    PrimeMinister primeMinister;
    State state;
    Security security;

    public Country() {
        primeMinister = new PrimeMinister();
        state = new State("Karnataka");
        security = new Security();
    }

    public void display() {
        System.out.println("Country: " + name);
        primeMinister.display();
        state.display();
        security.display();
    }
}
