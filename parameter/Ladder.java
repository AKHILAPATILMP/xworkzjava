class Ladder {
    
    public static void climb(int steps) {
        System.out.println("Climbing steps " + steps );
    }

    public static void hold(String material) {
        System.out.println("Ladder material " + material);
    }

    public static void height(double length) {
        System.out.println("Ladder height " + length );
    }

    
    public static void place(String location, int distance) {
        System.out.println("Placed ladder at " + location + distance );
    }

    public static void support(String type, int weight) {
        System.out.println("Ladder supports " + type  + weight );
    }

   
    public static void paint(String color, int layers, double dryingTime) {
        System.out.println("Painting ladder with " + color + " in " + layers + " layers. Drying time: " + dryingTime );
    }

    public static void fold(boolean foldable, String lockType, double width) {
        System.out.println("Foldable: " + foldable + ", Lock Type: " + lockType + ", Width: " + width );
    }
}