package com.xworkz.akhila.shop;

public class Shop {
    void purchase(Product product) {
        if (product != null) {
            product.sell();
        } else {
            System.out.println("No product available");
        }
    }
}
