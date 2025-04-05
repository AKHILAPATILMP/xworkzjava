package com.xworkz.isarelation.tennis;
public class TableTennis extends Tennis {

    public TableTennis() {
        super();
        System.out.println("TableTennis constructor is running - subclass");
    }

    @Override
    public void playMatch() {
        System.out.println("Playing a table tennis match indoors - subclass");
    }

    @Override
    public void serveBall() {
        System.out.println("Serving the ball with a spin - subclass");
    }

    @Override
    public void hitBackhand() {
        System.out.println("Hitting a backhand using paddle - subclass");
    }

    @Override
    public void hitForehand() {
        System.out.println("Hitting a forehand using paddle - subclass");
    }
}
