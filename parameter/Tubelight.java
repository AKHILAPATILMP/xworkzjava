class Tubelight {
   
    public static void switchOn(String room) {
        System.out.println("Turning on the light in " + room);
    }

    public static void brightness(int level) {
        System.out.println("Brightness level: " + level);
    }

    public static void color(String lightColor) {
        System.out.println("Light color: " + lightColor);
    }

   
    public static void install(String location, int height) {
        System.out.println("Installing tubelight at " + location + " with height " + height );
    }

    public static void repair(String issue, int cost) {
        System.out.println("Repairing " + issue + " for " + cost);
    }

    
    public static void schedule(String room, int hours, String timerMode) {
        System.out.println("Scheduled light in " + room + " for " + hours + " hours with " + timerMode + " mode");
    }

    public static void replace(String model, int quantity, double totalPrice) {
        System.out.println("Replacing " + quantity + " lights of model " + model + " for " + totalPrice);
    }
}