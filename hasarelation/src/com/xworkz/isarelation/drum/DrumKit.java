package com.xworkz.isarelation.drum;

public class DrumKit {

    public void test(Drum drum) {
        drum.hit();
        drum.adjustVolume();
        drum.playRhythm();
        drum.changeDrumHead();
        drum.cleanDrum();

        if (drum instanceof ElectricDrum) {
            System.out.println("Casting: Drum is an instance of ElectricDrum");
            ElectricDrum electric = (ElectricDrum) drum;
            electric.connectToAmp();
        }
    }
}
