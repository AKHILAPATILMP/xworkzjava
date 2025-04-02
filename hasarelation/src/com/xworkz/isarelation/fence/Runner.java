package com.xworkz.isarelation.fence;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Fence");
            Fence fence = new Fence();
            fence.enclose();
            fence.protect();
            fence.defineBoundary();
            fence.resistWeather();
            fence.durable();

            System.out.println("\nCreating an instance of ElectricFence using Fence reference");
            Fence fenceRef = new ElectricFence();
            fenceRef.enclose();
            fenceRef.protect();
            fenceRef.defineBoundary();
            fenceRef.resistWeather();
            fenceRef.durable();

            System.out.println("\nCreating an instance of ElectricFence using subclass reference");
            ElectricFence electricFence = new ElectricFence();
            electricFence.enclose();
            electricFence.protect();
            electricFence.defineBoundary();
            electricFence.resistWeather();
            electricFence.durable();
            electricFence.shockIntruders();
            electricFence.monitorSecurity();
            electricFence.autoRepair();
            electricFence.solarPowered();
            electricFence.alarmSystem();
        }
    }

