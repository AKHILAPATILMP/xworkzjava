package com.xworkz.isarelation.screen;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Screen");
            Screen screen = new Screen();
            screen.display();
            screen.adjustBrightness();
            screen.consumePower();
            screen.reflectLight();
            screen.protectEyes();

            System.out.println("\nCreating an instance of TouchScreen using Screen reference");
            Screen screenRef = new TouchScreen();
            screenRef.display();
            screenRef.adjustBrightness();
            screenRef.consumePower();
            screenRef.reflectLight();
            screenRef.protectEyes();

            System.out.println("\nCreating an instance of TouchScreen using subclass reference");
            TouchScreen touchScreen = new TouchScreen();
            touchScreen.display();
            touchScreen.adjustBrightness();
            touchScreen.consumePower();
            touchScreen.reflectLight();
            touchScreen.protectEyes();
            touchScreen.detectTouch();
            touchScreen.multiTouchSupport();
            touchScreen.gestureControl();
            touchScreen.stylusSupport();
            touchScreen.fingerprintSensor();
        }
    }

