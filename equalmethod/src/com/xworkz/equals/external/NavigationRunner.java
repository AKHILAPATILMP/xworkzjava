package com.xworkz.equals.external;

import com.xworkz.equals.internal.Navigation;

public class NavigationRunner {
    public static void main(String[] args) {

        Navigation nav1 = new Navigation();
        nav1.setMode("GPS");
        nav1.setSource("New York");
        nav1.setDestination("Los Angeles");
        nav1.setDistance(4500);

        Navigation nav2 = new Navigation();
        nav2.setMode("GPS");
        nav2.setSource("Chicago");
        nav2.setDestination("Houston");
        nav2.setDistance(1600);

        boolean same = nav1.equals(nav2);
        System.out.println("nav1 equals nav2: " + same);

        System.out.println("Navigation 1: " + nav1);
        System.out.println("Navigation 2: " + nav2);

        System.out.println("Navigation 1 hashCode: " + nav1.hashCode());
        System.out.println("Navigation 2 hashCode: " + nav2.hashCode());
    }
}
