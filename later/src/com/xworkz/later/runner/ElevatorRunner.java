package com.xworkz.later.runner;

import com.xworkz.later.internal.Elevator;
import com.xworkz.later.internal.ElevatorImpl;
import com.xworkz.later.external.ElevatorUser;

public class ElevatorRunner {
    public static void main(String[] args) {
        Elevator elevator = new ElevatorImpl();
        ElevatorUser elevatorUser = new ElevatorUser(elevator); // abstraction
        elevatorUser.activate();
    }
}
