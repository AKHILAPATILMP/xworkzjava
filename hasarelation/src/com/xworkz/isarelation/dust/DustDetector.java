package com.xworkz.isarelation.dust;

public class DustDetector {

    public void scan(Dust dust) {
        dust.settle();
        dust.fly();
        dust.collect();
        dust.blow();
        dust.observe();

        if (dust instanceof SmartDust) {
            System.out.println("Casting: Dust is instance of SmartDust");
            SmartDust smart = (SmartDust) dust;
            smart.transmitData();
        }
    }
}
