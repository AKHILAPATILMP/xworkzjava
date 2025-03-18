package com.xworkz.akhila.hello;

public class Garage {
    void use(Motor motor){
       if(motor !=null){
           motor.rotate();
       }
       else{
           System.out.println("it is null");
       }
    }
}
