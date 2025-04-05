package com.xworkz.isarelation.blade;
    public class Runner {
        public static void main(String[] args) {

            System.out.println("\nCreating an instance of Blade");
            Blade blade = new Blade();
            blade.cut();
            blade.sharpen();
            blade.clean();
            blade.store();

            System.out.println("\nCreating an instance of RazorBlade using Blade reference");
            Blade bladeRef = new RazorBlade();
            bladeRef.cut();
            bladeRef.sharpen();
            bladeRef.clean();
            bladeRef.store();

            System.out.println("\nCreating an instance of RazorBlade using subclass reference");
            RazorBlade razorBlade = new RazorBlade();
            razorBlade.cut();
            razorBlade.sharpen();
            razorBlade.clean();
            razorBlade.store();
        }
    }

