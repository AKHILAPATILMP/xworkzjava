package com.xworkz.equals.internal;

import java.util.Objects;

public class Router {
    private String brand;       // Brand of the router (e.g., "TP-Link", "Netgear")
    private double speed;       // Speed of the router (e.g., 1200 Mbps)
    private boolean isWireless; // Whether the router is wireless or wired

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Router) {
                System.out.println("Router ref will compare");
                Router router1 = this;
                Router router2 = (Router) obj;

                // Compare three properties: brand, speed, and isWireless
                if (router1.brand.equals(router2.brand) && router1.speed == router2.speed && router1.isWireless == router2.isWireless) {
                    System.out.println("Both routers are the same based on brand, speed, and isWireless");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Router [brand=" + brand + ", speed=" + speed + ", isWireless=" + isWireless + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, speed, isWireless);
    }
}
