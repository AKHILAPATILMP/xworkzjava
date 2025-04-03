package com.xworkz.isarelation.whiteboard;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartWhiteboard using Whiteboard reference");
            WhiteBoard whiteboardRef = new SmartWhiteboard();
            whiteboardRef.write();
            whiteboardRef.erase();
            whiteboardRef.draw();
            whiteboardRef.clean();
            whiteboardRef.display();

            System.out.println("\nCreating an instance of SmartWhiteboard using subclass reference");
            SmartWhiteboard smartWhiteboard = new SmartWhiteboard();
            smartWhiteboard.write();
            smartWhiteboard.erase();
            smartWhiteboard.draw();
            smartWhiteboard.clean();
            smartWhiteboard.display();
            smartWhiteboard.connectToWiFi();
            smartWhiteboard.digitalWrite();
            smartWhiteboard.screenShare();
            smartWhiteboard.voiceControl();
            smartWhiteboard.saveContent();
        }
    }

