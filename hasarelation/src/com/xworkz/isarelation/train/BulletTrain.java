package com.xworkz.isarelation.train;

public class BulletTrain extends Train {

    public BulletTrain() {
        super();
        System.out.println("BulletTrain constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("BulletTrain is starting at high speed - subclass");
    }

    @Override
    public void stop() {
        System.out.println("BulletTrain is stopping using magnetic brakes - subclass");
    }

    @Override
    public void accelerate() {
        System.out.println("BulletTrain is accelerating rapidly - subclass");
    }

    @Override
    public void soundHorn() {
        System.out.println("BulletTrain horn is modern and less noisy - subclass");
    }
}

