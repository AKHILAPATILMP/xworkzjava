package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.Helicopter;
import com.xworkz.interfc.externali.HomeSecuritySystem;

public class Invoice implements HomeSecuritySystem, Helicopter {
    @Override
    public void takeOff() {
        System.out.println("");
    }

    @Override
    public void land() {
        System.out.println("");
    }

    @Override
    public void fly() {
        System.out.println("");
    }

    @Override
    public void armSystem() {
        System.out.println("");
    }

    @Override
    public void disarmSystem() {
        System.out.println("");
    }

    @Override
    public void alertIntrusion() {
        System.out.println("");
    }
    @Override
    public void move(){
        System.out.println("helicopter moves");
    }
    @Override
    public void home (){
        System.out.println("home");
    }
}
