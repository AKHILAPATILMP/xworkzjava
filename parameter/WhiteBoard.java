class WhiteBoard {
    
    public static void write(String message) {
        System.out.println("Writing on board: " + message);
    }

    public static void erase(String section) {
        System.out.println("Erasing: " + section);
    }

    public static void color(String markerColor) {
        System.out.println("Using marker color: " + markerColor);
    }

    
    public static void draw(String shape, int size) {
        System.out.println("Drawing a " + shape + " of size " + size);
    }

    public static void clean(String cleanerType, int time) {
        System.out.println("Cleaning with " + cleanerType + " for " + time);
    }

    
    public static void schedule(String topic, int duration, String teacher) {
        System.out.println("Scheduled " + topic + " for " + duration + " mins with " + teacher);
    }

    public static void display(String content, int fontSize, String fontColor) {
        System.out.println("Displaying: " + content + " with font size " + fontSize + " in " + fontColor);
    }
}