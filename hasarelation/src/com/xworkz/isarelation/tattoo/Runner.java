package com.xworkz.isarelation.tattoo;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Tattoo");
            Tattoo tattoo = new Tattoo();
            tattoo.design();
            tattoo.ink();
            tattoo.shade();
            tattoo.remove();
            tattoo.heal();

            System.out.println("\nCreating an instance of PermanentTattoo using Tattoo reference");
            Tattoo tattooRef = new PermanentTattoo();
            tattooRef.design();
            tattooRef.ink();
            tattooRef.shade();
            tattooRef.remove();
            tattooRef.heal();

            System.out.println("\nCreating an instance of PermanentTattoo using subclass reference");
            PermanentTattoo permanentTattoo = new PermanentTattoo();
            permanentTattoo.design();
            permanentTattoo.ink();
            permanentTattoo.shade();
            permanentTattoo.remove();
            permanentTattoo.heal();
            permanentTattoo.useNeedleGun();
            permanentTattoo.addColor();
            permanentTattoo.maintainTattoo();
            permanentTattoo.enhanceDetail();
            permanentTattoo.longLasting();
        }
    }

