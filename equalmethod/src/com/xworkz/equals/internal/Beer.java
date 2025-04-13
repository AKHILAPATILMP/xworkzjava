package com.xworkz.equals.internal;

import java.util.Objects;

public class Beer {
    private String brand;
    private double price;
    private double alcoholPercentage;
    private int quantity;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
 @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Beer) {
                System.out.println("Beer ref will compare");
                Beer beer1 = this;
                Beer beer2 = (Beer) obj;


                if (beer1.brand.equals(beer2.brand)) {
                    System.out.println("Both  beers are the same");
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "Beer [brand=" + brand + ", price=" + price + ", alcoholPercentage=" + alcoholPercentage + ", quantity=" + quantity + "]";
    }
 @Override
    public int hashCode() {
        return Objects.hash(brand, price, alcoholPercentage, quantity);
    }
}
