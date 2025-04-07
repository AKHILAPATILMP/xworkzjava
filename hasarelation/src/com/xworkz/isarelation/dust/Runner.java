package com.xworkz.isarelation.dust;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Dust");
        Dust regularDust = new Dust();
        regularDust.settle();
        regularDust.fly();
        regularDust.collect();
        regularDust.blow();
        regularDust.observe();

        System.out.println("\nCreating an instance of SmartDust using Dust reference");
        Dust smartRef = new SmartDust();
        smartRef.settle();
        smartRef.fly();
        smartRef.collect();
        smartRef.blow();
        smartRef.observe();

        System.out.println("\nCreating an instance of SmartDust using subclass reference");
        SmartDust smart = new SmartDust();
        smart.settle();
        smart.fly();
        smart.collect();
        smart.blow();
        smart.observe();
        smart.transmitData();

        System.out.println("\nRunning DustDetector operations");
        DustDetector detector = new DustDetector();
        detector.scan(regularDust);
        detector.scan(smartRef);
        detector.scan(smart);
    }
}
