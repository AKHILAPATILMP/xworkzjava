package com.xworkz.isarelation.violin;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Violin");
        Violin violin = new Violin();
        violin.play();
        violin.tune();
        violin.stop();
        violin.maintain();

        System.out.println("\nCreating an instance of ElectricViolin using Violin reference");
        Violin electricRef = new ElectricViolin();
        electricRef.play();
        electricRef.tune();
        electricRef.stop();
        electricRef.maintain();

        System.out.println("\nCreating an instance of ElectricViolin using subclass reference");
        ElectricViolin electricViolin = new ElectricViolin();
        electricViolin.play();
        electricViolin.tune();
        electricViolin.stop();
        electricViolin.maintain();
    }
}
