package com.xworkz.associate;

public class Material {
        private String name;
        private int noOfThing;
        public Material(String name,int noOfThing){
            this.name=name;
            this.noOfThing=noOfThing;
        }
        public void MatDis(){
            System.out.println("Material name:"+this.name);
            System.out.println("No of Thing:"+this.noOfThing);
        }

    }

