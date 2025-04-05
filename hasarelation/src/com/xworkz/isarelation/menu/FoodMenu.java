package com.xworkz.isarelation.menu;
public class FoodMenu extends Menu {

    public FoodMenu() {
        super();
        System.out.println("FoodMenu constructor is running - subclass");
    }

    @Override
    public void showItems() {
        System.out.println("Displaying food items - subclass");
    }

    @Override
    public void selectItem() {
        System.out.println("Selecting food item - subclass");
    }

    @Override
    public void removeItem() {
        System.out.println("Removing food item - subclass");
    }

    @Override
    public void displayMenuInfo() {
        System.out.println("Showing detailed food menu information - subclass");
    }
}


