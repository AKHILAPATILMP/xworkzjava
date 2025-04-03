package com.xworkz.isarelation.shelf;

    public class SmartShelf extends Shelf {
        public SmartShelf() {
            super();
            System.out.println("SmartShelf constructor is running");
        }

        public void autoSort() {
            System.out.println("SmartShelf is automatically sorting items");
        }

        public void weightDetection() {
            System.out.println("SmartShelf is detecting the weight of stored items");
        }

        public void inventoryTracking() {
            System.out.println("SmartShelf is tracking inventory in real-time");
        }

        public void sendNotifications() {
            System.out.println("SmartShelf is sending notifications when stock is low");
        }

        public void adjustHeight() {
            System.out.println("SmartShelf is adjusting its height automatically");
        }
    }

