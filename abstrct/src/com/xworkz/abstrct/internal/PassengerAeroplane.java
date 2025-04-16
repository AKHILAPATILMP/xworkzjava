package com.xworkz.abstrct.internal;
// No need to override anything since aeroplane has no abstract method
// But we can add more specific behavior if needed

public class PassengerAeroplane extends Aeroplane {

    public void carryPassengers() {
        System.out.println("Carrying passengers to their destination.");
    }
}
