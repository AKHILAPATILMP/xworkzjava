package com.xworkz.isarelation.blade;
    public class Blade {

        public Blade() {
            System.out.println("Blade constructor is running - parent class");
        }

        public void cut() {
            System.out.println("Blade is cutting - parent class");
        }

        public void sharpen() {
            System.out.println("Blade is being sharpened - parent class");
        }

        public void clean() {
            System.out.println("Cleaning the blade - parent class");
        }

        public void store() {
            System.out.println("Storing the blade safely - parent class");
        }
    }

