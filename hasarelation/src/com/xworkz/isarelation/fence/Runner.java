package com.xworkz.isarelation.fence;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Fence");
        Fence fence = new Fence();
        fence.build();
        fence.openGate();
        fence.closeGate();
        fence.checkSecurity();

        System.out.println("\nCreating an instance of ElectricFence using Fence reference");
        Fence fenceRef = new ElectricFence();
        fenceRef.build();
        fenceRef.openGate();
        fenceRef.closeGate();
        fenceRef.checkSecurity();

        System.out.println("\nCreating an instance of ElectricFence using subclass reference");
        ElectricFence electricFence = new ElectricFence();
        electricFence.build();
        electricFence.openGate();
        electricFence.closeGate();
        electricFence.checkSecurity();
    }
}
