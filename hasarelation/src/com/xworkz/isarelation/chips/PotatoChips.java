package com.xworkz.isarelation.chips;

    public class PotatoChips extends Chips {
        public PotatoChips() {
            super();
            System.out.println("PotatoChips constructor is running");
        }

        public void addSalt() {
            System.out.println("PotatoChips: Adding salt...");
        }

        public void addSpices() {
            System.out.println("PotatoChips: Adding spices...");
        }

        public void makeThinSlices() {
            System.out.println("PotatoChips: Slicing potatoes thinly...");
        }

        public void bake() {
            System.out.println("PotatoChips: Baking instead of frying for a healthy option...");
        }

        public void crispTexture() {
            System.out.println("PotatoChips: Ensuring a crispy texture...");
        }
    }

