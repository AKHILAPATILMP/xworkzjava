package com.xworkz.isarelation.media;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Media");
        Media media = new Media();
        media.playContent();
        media.pauseContent();
        media.stopContent();
        media.displayInfo();

        System.out.println("\nCreating an instance of DigitalMedia using Media reference");
        Media mediaRef = new DigitalMedia();
        mediaRef.playContent();
        mediaRef.pauseContent();
        mediaRef.stopContent();
        mediaRef.displayInfo();

        System.out.println("\nCreating an instance of DigitalMedia using subclass reference");
        DigitalMedia digitalMedia = new DigitalMedia();
        digitalMedia.playContent();
        digitalMedia.pauseContent();
        digitalMedia.stopContent();
        digitalMedia.displayInfo();
    }
}
