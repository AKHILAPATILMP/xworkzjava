package com.xworkz.isarelation.menu;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Menu");
        Menu menu = new Menu();
        menu.showItems();
        menu.selectItem();
        menu.removeItem();
        menu.displayMenuInfo();

        System.out.println("\nCreating an instance of FoodMenu using Menu reference");
        Menu menuRef = new FoodMenu();
        menuRef.showItems();
        menuRef.selectItem();
        menuRef.removeItem();
        menuRef.displayMenuInfo();

        System.out.println("\nCreating an instance of FoodMenu using subclass reference");
        FoodMenu foodMenu = new FoodMenu();
        foodMenu.showItems();
        foodMenu.selectItem();
        foodMenu.removeItem();
        foodMenu.displayMenuInfo();
    }
}
