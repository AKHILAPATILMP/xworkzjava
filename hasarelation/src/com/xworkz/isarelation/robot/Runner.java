package com.xworkz.isarelation.robot;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Robot");
            Robot robot = new Robot();
            robot.start();
            robot.move();
            robot.chargeBattery();
            robot.performTask();
            robot.shutdown();

            System.out.println("\nCreating an instance of AI_Robot using Robot reference");
            Robot robotRef = new AI_Robot();
            robotRef.start();
            robotRef.move();
            robotRef.chargeBattery();
            robotRef.performTask();
            robotRef.shutdown();

            System.out.println("\nCreating an instance of AI_Robot using subclass reference");
            AI_Robot aiRobot = new AI_Robot();
            aiRobot.start();
            aiRobot.move();
            aiRobot.chargeBattery();
            aiRobot.performTask();
            aiRobot.shutdown();
            aiRobot.analyzeData();
            aiRobot.recognizeVoice();
            aiRobot.interact();
            aiRobot.learn();
            aiRobot.selfRepair();
        }
    }

