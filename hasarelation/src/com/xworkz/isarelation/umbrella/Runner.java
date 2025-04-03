package com.xworkz.isarelation.umbrella;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartUmbrella using Umbrella reference");
            Umbrella umbrellaRef = new SmartUmbrella();
            umbrellaRef.open();
            umbrellaRef.close();
            umbrellaRef.protectFromRain();
            umbrellaRef.protectFromSun();
            umbrellaRef.fold();

            System.out.println("\nCreating an instance of SmartUmbrella using subclass reference");
            SmartUmbrella smartUmbrella = new SmartUmbrella();
            smartUmbrella.open();
            smartUmbrella.close();
            smartUmbrella.protectFromRain();
            smartUmbrella.protectFromSun();
            smartUmbrella.fold();
            smartUmbrella.autoOpen();
            smartUmbrella.autoClose();
            smartUmbrella.weatherAlert();
            smartUmbrella.solarCharging();
            smartUmbrella.LEDLight();
        }
    }

