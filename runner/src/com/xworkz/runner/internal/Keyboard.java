package com.xworkz.runner.internal;

public class Keyboard {
    private String type;
    private String layout;
    private double price;

    public Keyboard(String type, String layout, double price) {
        this.type = type;
        this.layout = layout;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", layout=" + layout + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 505;
    }
}
