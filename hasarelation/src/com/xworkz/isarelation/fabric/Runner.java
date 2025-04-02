package com.xworkz.isarelation.fabric;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Fabric");
            Fabric fabric = new Fabric();
            fabric.weave();
            fabric.dye();
            fabric.stretch();
            fabric.absorbWater();
            fabric.provideWarmth();

            System.out.println("\nCreating an instance of CottonFabric using Fabric reference");
            Fabric fabricRef = new CottonFabric();
            fabricRef.weave();
            fabricRef.dye();
            fabricRef.stretch();
            fabricRef.absorbWater();
            fabricRef.provideWarmth();

            System.out.println("\nCreating an instance of CottonFabric using subclass reference");
            CottonFabric cottonFabric = new CottonFabric();
            cottonFabric.weave();
            cottonFabric.dye();
            cottonFabric.stretch();
            cottonFabric.absorbWater();
            cottonFabric.provideWarmth();
            cottonFabric.softTexture();
            cottonFabric.breathable();
            cottonFabric.ecoFriendly();
            cottonFabric.wrinkleEasily();
            cottonFabric.durable();
        }
    }

