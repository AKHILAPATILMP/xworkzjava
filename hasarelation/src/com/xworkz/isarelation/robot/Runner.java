package com.xworkz.isarelation.robot;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Robot");
        Robot robot = new Robot();
        robot.start();
        robot.stop();
        robot.performTask();
        robot.recharge();

        System.out.println("\nCreating an instance of ServiceRobot using Robot reference");
        Robot ref = new ServiceRobot();
        ref.start();
        ref.stop();
        ref.performTask();
        ref.recharge();

        System.out.println("\nCreating an instance of ServiceRobot using subclass reference");
        ServiceRobot service = new ServiceRobot();
        service.start();
        service.stop();
        service.performTask();
        service.recharge();
    }
}
