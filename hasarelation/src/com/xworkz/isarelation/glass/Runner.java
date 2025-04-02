package com.xworkz.isarelation.glass;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Glass");
            Glass glass = new Glass();
            glass.reflect();
            glass.refract();
            glass.transparent();
            glass.fragile();
            glass.insulate();

            System.out.println("\nCreating an instance of TemperedGlass using Glass reference");
            Glass glassRef = new TemperedGlass();
            glassRef.reflect();
            glassRef.refract();
            glassRef.transparent();
            glassRef.fragile();
            glassRef.insulate();

            System.out.println("\nCreating an instance of TemperedGlass using subclass reference");
            TemperedGlass temperedGlass = new TemperedGlass();
            temperedGlass.reflect();
            temperedGlass.refract();
            temperedGlass.transparent();
            temperedGlass.fragile();
            temperedGlass.insulate();
            temperedGlass.strengthen();
            temperedGlass.heatResistant();
            temperedGlass.shatterSafely();
            temperedGlass.scratchResistant();
            temperedGlass.durable();
        }
    }

