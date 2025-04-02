package com.xworkz.isarelation.menu;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Menu");
            Menu menu = new Menu();
            menu.displayItems();
            menu.selectItem();
            menu.addCustomization();
            menu.checkAvailability();
            menu.showPrice();

            System.out.println("\nCreating an instance of RestaurantMenu using Menu reference");
            Menu menuRef = new RestaurantMenu();
            menuRef.displayItems();
            menuRef.selectItem();
            menuRef.addCustomization();
            menuRef.checkAvailability();
            menuRef.showPrice();

            System.out.println("\nCreating an instance of RestaurantMenu using subclass reference");
            RestaurantMenu restaurantMenu = new RestaurantMenu();
            restaurantMenu.displayItems();
            restaurantMenu.selectItem();
            restaurantMenu.addCustomization();
            restaurantMenu.checkAvailability();
            restaurantMenu.showPrice();
            restaurantMenu.showSpecials();
            restaurantMenu.showVegOptions();
            restaurantMenu.showNonVegOptions();
            restaurantMenu.applyDiscount();
            restaurantMenu.suggestPairing();
        }
    }

