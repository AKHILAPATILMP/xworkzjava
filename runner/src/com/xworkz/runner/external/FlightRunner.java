package com.xworkz.runner.external;

import com.xworkz.runner.internal.Flight;

public class FlightRunner {public static void main(String[] args) {
    Flight flight = new Flight("SkyHigh", 35000, 180);
    System.out.println("flight" + flight.toString());
}
}
