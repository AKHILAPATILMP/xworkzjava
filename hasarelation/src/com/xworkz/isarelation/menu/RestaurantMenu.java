package com.xworkz.isarelation.menu;

    public class RestaurantMenu extends Menu {
        public RestaurantMenu() {
            super();
            System.out.println("RestaurantMenu constructor is running");
        }

        public void showSpecials() {
            System.out.println("RestaurantMenu: Displaying today's specials...");
        }

        public void showVegOptions() {
            System.out.println("RestaurantMenu: Showing vegetarian options...");
        }

        public void showNonVegOptions() {
            System.out.println("RestaurantMenu: Showing non-vegetarian options...");
        }

        public void applyDiscount() {
            System.out.println("RestaurantMenu: Applying available discounts...");
        }

        public void suggestPairing() {
            System.out.println("RestaurantMenu: Suggesting food pairings...");
        }
    }


