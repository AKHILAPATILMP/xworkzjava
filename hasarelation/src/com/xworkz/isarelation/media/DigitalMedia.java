package com.xworkz.isarelation.media;

public class DigitalMedia extends Media {

    public DigitalMedia() {
        super();
        System.out.println("DigitalMedia constructor is running - subclass");
    }

    @Override
    public void playContent() {
        System.out.println("Streaming digital content - subclass");
    }

    @Override
    public void pauseContent() {
        System.out.println("Pausing digital stream - subclass");
    }

    @Override
    public void stopContent() {
        System.out.println("Stopping digital stream - subclass");
    }

    @Override
    public void displayInfo() {
        System.out.println("Displaying digital media details - subclass");
    }
}
