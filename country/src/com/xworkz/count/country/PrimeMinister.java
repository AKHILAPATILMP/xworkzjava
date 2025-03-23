package com.xworkz.count.country;

import com.xworkz.count.city.Portfolio;
import com.xworkz.count.experience.Security;

public class PrimeMinister {
    String name = "Modhiji";
    Minister minister;
    Portfolio[] portfolios = new Portfolio[2];
    Security security;

    PrimeMinister() {
        minister = new Minister("Manohar Lal");
        portfolios[0] = new Portfolio("Executive");
        portfolios[1] = new Portfolio("Authority");
        security = new Security();
    }

    void display() {
        System.out.println("  Prime Minister: " + name);
        minister.display();
        for (Portfolio portfolio : portfolios) portfolio.display();
        security.display();
    }

}


