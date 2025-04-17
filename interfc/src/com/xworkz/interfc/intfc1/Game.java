package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.Fridge;
import com.xworkz.interfc.externali.Generator;

public class Game implements Fridge, Generator {
    @Override
    public void cool() {
        System.out.println("");
    }

    @Override
    public void defrost() {
        System.out.println("");
    }

    @Override
    public void setTemperature() {
        System.out.println("");
    }

    @Override
    public void start() {
        System.out.println("");
    }

    @Override
    public void stop() {
        System.out.println("");
    }

    @Override
    public void adjustPower() {
        System.out.println("");
    }
    @Override
    public void close(){
        System.out.println("");
    }
    @Override
   public void off(){
        System.out.println("off the fridge");
    }
}
