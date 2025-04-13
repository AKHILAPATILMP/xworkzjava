package com.xworkz.equals.internal;

import java.util.Objects;

public class Headset {
    private String brand;
    private double price;
    private boolean wireless;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Headset) {
                System.out.println("Headset ref will compare");
                Headset headset1 = this;
                Headset headset2 = (Headset) obj;

                if (headset1.brand.equals(headset2.brand) &&
                        headset1.price == headset2.price &&
                        headset1.wireless == headset2.wireless) {
                    System.out.println("Both headsets have the same brand, price, and wireless feature");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Headset [brand=" + brand + ", price=" + price + ", wireless=" + wireless + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, wireless);
    }
}
