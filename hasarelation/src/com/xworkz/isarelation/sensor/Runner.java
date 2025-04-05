package com.xworkz.isarelation.sensor;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Sensor");
        Sensor sensor = new Sensor();
        sensor.detect();
        sensor.calibrate();
        sensor.reset();
        sensor.displayStatus();

        System.out.println("\nCreating an instance of MotionSensor using Sensor reference");
        Sensor sensorRef = new MotionSensor();
        sensorRef.detect();
        sensorRef.calibrate();
        sensorRef.reset();
        sensorRef.displayStatus();

        System.out.println("\nCreating an instance of MotionSensor using subclass reference");
        MotionSensor motionSensor = new MotionSensor();
        motionSensor.detect();
        motionSensor.calibrate();
        motionSensor.reset();
        motionSensor.displayStatus();
    }
}
