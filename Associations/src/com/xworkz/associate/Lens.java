package com.xworkz.associate;

public class Lens {


        private String type;
        private int size;
        public void setType(String type){
            this.type=type;
        }
        public String getType(String type){
            return this.type="Glass";
        }
        public Lens(int size){
            System.out.println("running no-static method Lens");
            this.size=25;
            System.out.println(this.size);
            System.out.println(this.type);

        }

    }