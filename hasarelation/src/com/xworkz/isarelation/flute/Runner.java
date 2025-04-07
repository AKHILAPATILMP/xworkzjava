package com.xworkz.isarelation.flute;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Flute:");
        Flute basicFlute = new Flute();
        basicFlute.play();
        basicFlute.clean();
        basicFlute.tune();
        basicFlute.store();
        basicFlute.transport();

        System.out.println("\nCreating instance of ElectricFlute using Flute reference:");
        Flute fluteRef = new ElectricFlute();
        fluteRef.play();
        fluteRef.clean();
        fluteRef.tune();
        fluteRef.store();
        fluteRef.transport();

        System.out.println("\nCreating instance of ElectricFlute with subclass reference:");
        ElectricFlute electric = new ElectricFlute();
        electric.play();
        electric.clean();
        electric.tune();
        electric.store();
        electric.transport();
        electric.charge();

        System.out.println("\nUsing FluteController for casting check:");
        FluteController controller = new FluteController();
        controller.control(basicFlute);
        controller.control(fluteRef);
        controller.control(electric);
    }
}
