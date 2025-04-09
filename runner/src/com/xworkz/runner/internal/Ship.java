package com.xworkz.runner.internal;

public class Ship {

        private String name;
        private String type; // e.g., Cargo, Cruise
        private double cost;

    public Ship(String name, String type, double cost) {
            this.name = name;
            this.type = type;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "[name=" + name + ", type=" + type + ", cost=" + cost + "]";
        }
}
