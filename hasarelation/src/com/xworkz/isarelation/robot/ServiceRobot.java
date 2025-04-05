package com.xworkz.isarelation.robot;
public class ServiceRobot extends Robot {

    public ServiceRobot() {
        super();
        System.out.println("ServiceRobot constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("ServiceRobot is booting with AI modules - subclass");
    }

    @Override
    public void stop() {
        System.out.println("ServiceRobot is shutting down smoothly - subclass");
    }

    @Override
    public void performTask() {
        System.out.println("ServiceRobot is assisting customers - subclass");
    }

    @Override
    public void recharge() {
        System.out.println("ServiceRobot is using wireless charging - subclass");
    }
}


