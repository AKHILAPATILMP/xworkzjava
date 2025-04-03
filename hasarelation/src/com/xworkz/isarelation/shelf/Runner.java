package com.xworkz.isarelation.shelf;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartShelf using Shelf reference");
            Shelf shelfRef = new SmartShelf();
            shelfRef.storeItems();
            shelfRef.organize();
            shelfRef.clean();
            shelfRef.removeItems();
            shelfRef.displayItems();

            System.out.println("\nCreating an instance of SmartShelf using subclass reference");
            SmartShelf smartShelf = new SmartShelf();
            smartShelf.storeItems();
            smartShelf.organize();
            smartShelf.clean();
            smartShelf.removeItems();
            smartShelf.displayItems();
            smartShelf.autoSort();
            smartShelf.weightDetection();
            smartShelf.inventoryTracking();
            smartShelf.sendNotifications();
            smartShelf.adjustHeight();
        }
    }

