package com.xworkz.equals.external;

import com.xworkz.equals.internal.Beer;

public class BeerRunner {
    public static void main(String[] args) {

       Beer beer1 = new Beer();
        beer1.setBrand("Kingfisher ");
        beer1.setPrice(200);
        beer1.setAlcoholPercentage(5.0);
        beer1.setQuantity(330);

        Beer beer2 = new Beer();
        beer2.setBrand("Kingfisher");
        beer2.setPrice(500);
        beer2.setAlcoholPercentage(4.0);
        beer2.setQuantity(350);

         boolean same = beer1.equals(beer2);
        System.out.println("beer1 equals beer2: " + same);

        System.out.println("Beer 1: " + beer1);
        System.out.println("Beer 2: " + beer2);

        System.out.println("Beer 1 hashCode: " + beer1.hashCode());
        System.out.println("Beer 2 hashCode: " + beer2.hashCode());
    }
}
