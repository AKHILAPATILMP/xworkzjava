package com.xworkz.later.external;

import com.xworkz.later.internal.Elevator;

public class ElevatorUser {

    Elevator elevator;

    public ElevatorUser(Elevator elevator) {
        this.elevator = elevator;
        System.out.println("ElevatorUser is initialized");
    }

    public void activate() {
        if (this.elevator != null) {
            this.elevator.move();
        } else {
            System.out.println("No elevator to move");
        }
    }
}
