package com.xworkz.count.country;


import com.xworkz.count.city.House;
import com.xworkz.count.city.Portfolio;
import com.xworkz.count.experience.Security;

public class PersonalAssistant {
    String name = "Raman";
    House house;
    Portfolio[] portfolios = new Portfolio[2];
    Security security;

    PersonalAssistant() {
        house = new House();
        portfolios[0] = new Portfolio("Raman Portfolio");
        portfolios[1] = new Portfolio("PA Management");
        security = new Security();
    }

    void display() {
        System.out.println("      Personal Assistant: " + name);
        house.display();
        for (Portfolio portfolio : portfolios) portfolio.display();
        security.display();
    }
}
