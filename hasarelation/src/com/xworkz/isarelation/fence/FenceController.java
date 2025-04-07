package com.xworkz.isarelation.fence;

public class FenceController {
    public void manage(Fence fence) {
        fence.build();
        fence.paint();
        fence.repair();
        fence.inspect();
        fence.openGate();

        if (fence instanceof ElectricFence) {
            System.out.println("Casting: Fence is instance of ElectricFence");
            ElectricFence electric = (ElectricFence) fence;
            electric.activateElectricity();
        }
    }
}
