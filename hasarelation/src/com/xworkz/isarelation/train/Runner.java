package com.xworkz.isarelation.train;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Train");
        Train train = new Train();
        train.start();
        train.stop();
        train.accelerate();
        train.soundHorn();

        System.out.println("\nCreating an instance of BulletTrain using Train reference");
        Train ref = new BulletTrain();
        ref.start();
        ref.stop();
        ref.accelerate();
        ref.soundHorn();

        System.out.println("\nCreating an instance of BulletTrain using subclass reference");
        BulletTrain bullet = new BulletTrain();
        bullet.start();
        bullet.stop();
        bullet.accelerate();
        bullet.soundHorn();
    }
}
