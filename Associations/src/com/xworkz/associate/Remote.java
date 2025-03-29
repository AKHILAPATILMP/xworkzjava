package com.xworkz.associate;


    public class Remote {

            private String company="Sonic";
            private String color="black";
            private Battery battery;

            public Remote(String company, String color,Battery battery){
                this.company=company;
                this.color=color;
                this.battery=battery;

            }
            public void RemoteDis(){
                System.out.println("Company:"+this.company);
                System.out.println("Color:"+this.color);
                System.out.println(this.battery);
                battery.Batdisplay();
            }
        }


