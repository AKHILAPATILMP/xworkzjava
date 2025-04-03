package com.xworkz.isarelation.mirror;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartMirror using Mirror reference");
            Mirror mirrorRef = new SmartMirror();
            mirrorRef.reflect();
            mirrorRef.showImage();
            mirrorRef.clean();
            mirrorRef.magnify();
            mirrorRef.decorate();

            System.out.println("\nCreating an instance of SmartMirror using subclass reference");
            SmartMirror smartMirror = new SmartMirror();
            smartMirror.reflect();
            smartMirror.showImage();
            smartMirror.clean();
            smartMirror.magnify();
            smartMirror.decorate();
            smartMirror.displayWeather();
            smartMirror.playMusic();
            smartMirror.showTime();
            smartMirror.connectToWiFi();
            smartMirror.touchControl();
        }
    }

