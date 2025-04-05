package com.xworkz.isarelation.wall;

public class SmartWall extends Wall {

    public SmartWall() {
        super();
        System.out.println("SmartWall constructor is running - subclass");
    }

    @Override
    public void build() {
        System.out.println("Building a smart wall with sensors - subclass");
    }

    @Override
    public void paint() {
        System.out.println("Smart wall changes color automatically - subclass");
    }

    @Override
    public void demolish() {
        System.out.println("Smart wall self-disassembles - subclass");
    }

    @Override
    public void maintain() {
        System.out.println("Smart wall sends maintenance alerts - subclass");
    }
}
