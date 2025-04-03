package com.xworkz.isarelation.window;

public class Runner {

        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartWindows using Windows reference");
            Windows windowsRef = new SmartWindows();
            windowsRef.open();
            windowsRef.close();
            windowsRef.lock();
            windowsRef.unlock();

            System.out.println("\nCreating an instance of SmartWindows using subclass reference");
            SmartWindows smartWin = new SmartWindows();
            smartWin.open();
            smartWin.close();
            smartWin.lock();
            smartWin.unlock();
            smartWin.autoTint();
            smartWin.rainSensor();
            smartWin.voiceControl();
            smartWin.remoteControl();
        }
    }

