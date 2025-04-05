package com.xworkz.isarelation.sensor;
public class MotionSensor extends Sensor {

    public MotionSensor() {
        super();
        System.out.println("MotionSensor constructor is running - subclass");
    }

    @Override
    public void detect() {
        System.out.println("MotionSensor detects movement using infrared - subclass");
    }

    @Override
    public void calibrate() {
        System.out.println("MotionSensor auto-calibrates - subclass");
    }

    @Override
    public void reset() {
        System.out.println("MotionSensor reset remotely - subclass");
    }

    @Override
    public void displayStatus() {
        System.out.println("MotionSensor status: ACTIVE - subclass");
    }
}

