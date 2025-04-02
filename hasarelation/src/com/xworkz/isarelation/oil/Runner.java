package com.xworkz.isarelation.oil;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Creating an instance of Oil ");
        Oil oil = new Oil();
        oil.Slip();
        oil.lubricate();
        oil.purify();
        oil.burn();
        oil.clean();

        System.out.println("\nCreating an instance of CastorOil");
        Oil oilRef = new CastorOil();
        oilRef.Slip();
        oilRef.lubricate();
        oilRef.purify();
        oilRef.burn();
        oilRef.clean();

        System.out.println("\nCreating an instance of CastorOil using subclass reference");
        CastorOil castorOil = new CastorOil();
        castorOil.Slip();
        castorOil.lubricate();
        castorOil.purify();
        castorOil.burn();
        castorOil.clean();
        castorOil.heal();
        castorOil.nourish();
        castorOil.soften();
        castorOil.shine();
        castorOil.protect();
    }
    }


