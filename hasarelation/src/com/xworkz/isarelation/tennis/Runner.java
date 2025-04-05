package com.xworkz.isarelation.tennis;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Tennis");
        Tennis tennis = new Tennis();
        tennis.playMatch();
        tennis.serveBall();
        tennis.hitBackhand();
        tennis.hitForehand();

        System.out.println("\nCreating an instance of TableTennis using Tennis reference");
        Tennis tennisRef = new TableTennis();
        tennisRef.playMatch();
        tennisRef.serveBall();
        tennisRef.hitBackhand();
        tennisRef.hitForehand();

        System.out.println("\nCreating an instance of TableTennis using subclass reference");
        TableTennis tableTennis = new TableTennis();
        tableTennis.playMatch();
        tableTennis.serveBall();
        tableTennis.hitBackhand();
        tableTennis.hitForehand();
    }
}

