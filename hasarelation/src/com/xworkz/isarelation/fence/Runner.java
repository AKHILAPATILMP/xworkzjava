package com.xworkz.isarelation.fence;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating a Fence instance:");
        Fence basicFence = new Fence();
        basicFence.build();
        basicFence.paint();
        basicFence.repair();
        basicFence.inspect();
        basicFence.openGate();

        System.out.println("\nCreating an ElectricFence instance with Fence reference:");
        Fence fenceRef = new ElectricFence();
        fenceRef.build();
        fenceRef.paint();
        fenceRef.repair();
        fenceRef.inspect();
        fenceRef.openGate();

        System.out.println("\nCreating an ElectricFence instance with subclass reference:");
        ElectricFence electric = new ElectricFence();
        electric.build();
        electric.paint();
        electric.repair();
        electric.inspect();
        electric.openGate();
        electric.activateElectricity();

        System.out.println("\nUsing FenceController to cast:");
        FenceController controller = new FenceController();
        controller.manage(basicFence);
        controller.manage(fenceRef);
        controller.manage(electric);
    }
}
