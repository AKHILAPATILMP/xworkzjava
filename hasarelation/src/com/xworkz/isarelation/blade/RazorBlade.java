package com.xworkz.isarelation.blade;

    public class RazorBlade extends Blade {

        public RazorBlade() {
            super();
            System.out.println("RazorBlade constructor is running - subclass");
        }

        @Override
        public void cut() {
            System.out.println("RazorBlade is used for shaving - subclass");
        }

        @Override
        public void sharpen() {
            System.out.println("RazorBlade cannot be sharpened - disposable - subclass");
        }

        @Override
        public void clean() {
            System.out.println("RazorBlade is cleaned with water - subclass");
        }

        @Override
        public void store() {
            System.out.println("RazorBlade stored in a dry place - subclass");
        }
    }

