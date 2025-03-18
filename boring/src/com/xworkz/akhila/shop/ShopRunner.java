package com.xworkz.akhila.shop;

public class ShopRunner {
    public static void main(String[] args) {
        Product product = new Product();
        Shop shop = new Shop();
        shop.purchase(product);
    }
}
