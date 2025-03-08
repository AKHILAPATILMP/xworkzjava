class Supra {
    static void startEngine() { System.out.println("Supra engine started."); }
    static void accelerate() { System.out.println("Supra is accelerating."); }
    static void applyBrakes() { System.out.println("Supra is slowing down."); }
    static void drift() { System.out.println("Supra is drifting!"); }
    static void displaySpeed() { System.out.println("Supra is running at 120 km/h."); }

    // Invoking methods from CarFeatures class
    static void invokeCarFeaturesMethods() {
        CarFeatures.checkFuel();
        CarFeatures.enableGPS();
        CarFeatures.adjustSeats();
        CarFeatures.testSuspension();
        CarFeatures.upgradeEngine();
    }

    public static void main(String[] args) {
        startEngine();
        accelerate();
        applyBrakes();
        drift();
        displaySpeed();

        invokeCarFeaturesMethods();
    }
}

class CarFeatures {
    static void checkFuel() { System.out.println("Checking fuel level."); }
    static void enableGPS() { System.out.println("GPS navigation enabled."); }
    static void adjustSeats() { System.out.println("Adjusting seats for comfort."); }
    static void testSuspension() { System.out.println("Testing car suspension."); }
    static void upgradeEngine() { System.out.println("Upgrading to a turbo engine."); }
}