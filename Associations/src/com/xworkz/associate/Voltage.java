package com.xworkz.associate;

public class Voltage {

        private int volts;
        private String voltType;
        public Voltage(int volts,String voltType){
            this.volts=volts;
            this.voltType=voltType;

        }
        public void voltDis(){
            System.out.println("Volt value:"+this.volts);
            System.out.println("volt type:"+this.voltType);
        }

    }

