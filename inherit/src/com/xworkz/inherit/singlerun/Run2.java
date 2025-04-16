package com.xworkz.inherit.singlerun;

import com.xworkz.inherit.single.DigitalWatch;

public class Run2 {
    public static void main(String[] args) {
        DigitalWatch digitalWatch = new DigitalWatch();
        digitalWatch.displayTime(); // Inherited method from Watch class
        digitalWatch.showDate();    // Method of DigitalWatch class
    }
}
