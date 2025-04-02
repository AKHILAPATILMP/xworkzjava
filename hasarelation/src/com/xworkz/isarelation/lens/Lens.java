package com.xworkz.isarelation.lens;
public class Lens {
    public Lens() {
        System.out.println("Lens constructor is running");
    }

    public void focus() {
        System.out.println("Lens: Adjusting focus...");
    }

    public void magnify() {
        System.out.println("Lens: Magnifying the view...");
    }

    public void filterLight() {
        System.out.println("Lens: Filtering light...");
    }

    public void correctDistortion() {
        System.out.println("Lens: Correcting optical distortion...");
    }

    public void captureImage() {
        System.out.println("Lens: Capturing image...");
    }
}
