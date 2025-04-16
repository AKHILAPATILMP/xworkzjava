package com.xworkz.inherit.hierun;

import com.xworkz.inherit.hierarchial.Cycle;
import com.xworkz.inherit.hierarchial.MountainCycle;
import com.xworkz.inherit.hierarchial.RoadCycle;
import com.xworkz.inherit.hierarchial.ElectricCycle;

public class Main2 { 
    public static void main(String[] args) {
        // Creating objects of subclasses

        // MountainCycle
        MountainCycle mountainCycle = new MountainCycle();
        mountainCycle.ride();        // Inherited from Cycle class
        mountainCycle.offRoad();     // Method of MountainCycle class

        // RoadCycle
        RoadCycle roadCycle = new RoadCycle();
        roadCycle.ride();           // Inherited from Cycle class
        roadCycle.smoothRide();     // Method of RoadCycle class

        // ElectricCycle
        ElectricCycle electricCycle = new ElectricCycle();
        electricCycle.ride();       // Inherited from Cycle class
        electricCycle.assistPedaling(); // Method of ElectricCycle class
    }
}
