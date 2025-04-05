package com.xworkz.isarelation.park;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Park");
        Park park = new Park();
        park.open();
        park.close();
        park.maintain();
        park.provideSeating();

        System.out.println("\nCreating an instance of ThemePark using Park reference");
        Park parkRef = new ThemePark();
        parkRef.open();
        parkRef.close();
        parkRef.maintain();
        parkRef.provideSeating();

        System.out.println("\nCreating an instance of ThemePark using subclass reference");
        ThemePark themePark = new ThemePark();
        themePark.open();
        themePark.close();
        themePark.maintain();
        themePark.provideSeating();
    }
}
