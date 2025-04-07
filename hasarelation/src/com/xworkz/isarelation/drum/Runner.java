package com.xworkz.isarelation.drum;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Drum");
        Drum basicDrum = new Drum();
        basicDrum.hit();
        basicDrum.adjustVolume();
        basicDrum.playRhythm();
        basicDrum.changeDrumHead();
        basicDrum.cleanDrum();

        System.out.println("\nCreating an instance of ElectricDrum using Drum reference");
        Drum electricRef = new ElectricDrum();
        electricRef.hit();
        electricRef.adjustVolume();
        electricRef.playRhythm();
        electricRef.changeDrumHead();
        electricRef.cleanDrum();

        System.out.println("\nCreating an instance of ElectricDrum using subclass reference");
        ElectricDrum electric = new ElectricDrum();
        electric.hit();
        electric.adjustVolume();
        electric.playRhythm();
        electric.changeDrumHead();
        electric.cleanDrum();
        electric.connectToAmp();

        System.out.println("\nRunning DrumKit operations");
        DrumKit kit = new DrumKit();
        kit.test(basicDrum);
        kit.test(electricRef);
        kit.test(electric);
    }
}
