package com.xworkz.associate;

public class Button {
        private String color;
        private boolean isPressed;

        public Button(String color, boolean isPressed) {
            this.color = color;
            this.isPressed = isPressed;
        }

        public void displayButtonDetails() {
            System.out.println("Button Color: " + this.color);
            System.out.println("Is Button Pressed: " + this.isPressed);
        }
    }