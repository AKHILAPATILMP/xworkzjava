package com.xowrkz.prep.prep1;

public class Runner {
    public static void main(String[] args) {
        Slipper.use();
        Water water=new Water();
        water.drink();
        Slipper slipper=new Slipper();
        slipper.wear();
    }
}