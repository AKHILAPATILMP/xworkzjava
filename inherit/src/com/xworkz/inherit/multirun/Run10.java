package com.xworkz.inherit.multirun;

import com.xworkz.inherit.multi.SmartCeilingFan;

public class Run10 {
    public static void main(String[] args) {
        SmartCeilingFan fan = new SmartCeilingFan();
        fan.rotate();              // Inherited from Fan
        fan.mountOnCeiling();      // Inherited from CeilingFan
        fan.controlWithRemote();   // Method of SmartCeilingFan
    }
}
