package com.xworkz.isarelation.submarine;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Submarine");
        Submarine submarine = new Submarine();
        submarine.dive();
        submarine.surface();
        submarine.navigate();
        submarine.detectObjects();

        System.out.println("\nCreating an instance of MilitarySubmarine using Submarine reference");
        Submarine subRef = new MilitarySubmarine();
        subRef.dive();
        subRef.surface();
        subRef.navigate();
        subRef.detectObjects();

        System.out.println("\nCreating an instance of MilitarySubmarine using subclass reference");
        MilitarySubmarine militarySub = new MilitarySubmarine();
        militarySub.dive();
        militarySub.surface();
        militarySub.navigate();
        militarySub.detectObjects();
    }
}
