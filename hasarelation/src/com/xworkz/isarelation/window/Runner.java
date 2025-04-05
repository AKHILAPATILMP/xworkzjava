package com.xworkz.isarelation.window;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Window");
        Window window = new Window();
        window.open();
        window.close();
        window.lock();
        window.clean();

        System.out.println("\nCreating an instance of SmartWindow using Window reference");
        Window ref = new SmartWindow();
        ref.open();
        ref.close();
        ref.lock();
        ref.clean();

        System.out.println("\nCreating an instance of SmartWindow using subclass reference");
        SmartWindow smart = new SmartWindow();
        smart.open();
        smart.close();
        smart.lock();
        smart.clean();
    }
}
