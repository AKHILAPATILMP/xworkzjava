package com.xworkz.associate;

public class Lamp {

        private String lampName;
        private int noOfLamp;
        private Warranty warranty;

        public Lamp(String lampName,Warranty warranty){
            System.out.println("running non-static method Lamp");
            this.lampName=lampName;
            this.warranty=warranty;
        }
        public int getNoOfLamp(){
            return this.noOfLamp;
        }
        public void setLampName(int noOfLamp){
            this.noOfLamp=noOfLamp;
        }
        public void LampDis(){
            System.out.println("Lamp name:"+this.lampName);
            System.out.println("No of Lamp:"+this.noOfLamp);
            this.warranty.WarDis();
        }
    }