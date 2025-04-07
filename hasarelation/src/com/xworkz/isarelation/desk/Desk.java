package com.xworkz.isarelation.desk;

public class Desk {

    public Desk() {
        System.out.println("Desk constructor is running - parent class");
    }

    public void supportItems() {
        System.out.println("Desk supports books and laptops - parent class");
    }

    public void provideSurface() {
        System.out.println("Providing flat surface for work - parent class");
    }

    public void storeItems() {
        System.out.println("Storing items in drawers - parent class");
    }

    public void adjustHeight() {
        System.out.println("Adjusting height manually - parent class");
    }

    public void cleanSurface() {
        System.out.println("Cleaning desk surface - parent class");
    }
}
