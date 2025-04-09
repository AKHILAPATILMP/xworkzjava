package com.xworkz.runner.external;

import com.xworkz.runner.internal.Journey;

public class JourneyRunner {

 public static void main(String[] args) {
    Journey journey = new Journey("A path of travel", "Growth and discovery", 8.9);
    System.out.println("journey" + journey.toString());
}}
