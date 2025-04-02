package com.xworkz.isarelation.sensor;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Sensor");
            Sensor sensor = new Sensor();
            sensor.detect();
            sensor.calibrate();
            sensor.sendData();
            sensor.analyzeData();
            sensor.alert();

            System.out.println("\nCreating an instance of TemperatureSensor using Sensor reference");
            Sensor sensorRef = new TemperatureSensor();
            sensorRef.detect();
            sensorRef.calibrate();
            sensorRef.sendData();
            sensorRef.analyzeData();
            sensorRef.alert();

            System.out.println("\nCreating an instance of TemperatureSensor using subclass reference");
            TemperatureSensor tempSensor = new TemperatureSensor();
            tempSensor.detect();
            tempSensor.calibrate();
            tempSensor.sendData();
            tempSensor.analyzeData();
            tempSensor.alert();
            tempSensor.measureTemperature();
            tempSensor.overheatWarning();
            tempSensor.coldWarning();
            tempSensor.adjustSettings();
            tempSensor.storeTemperatureData();
        }
    }
