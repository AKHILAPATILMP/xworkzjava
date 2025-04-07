package com.xworkz.isarelation.ac;

public class EcoAC {
public void smart(AC ac){
ac.turnOff();
ac.enableCooling();
ac.setTemperature();
ac.turnOn();

if (ac instanceof SmartAC){
    System.out.println("casting changes the parent ref ");
SmartAC smartAC=(SmartAC) ac;
smartAC.enablepowersave();
}
}
}

