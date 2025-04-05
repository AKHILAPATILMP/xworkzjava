package com.xworkz.isarelation.photocopy;
public class Photocopy {

    public Photocopy() {
        System.out.println("Photocopy constructor is running - parent class");
    }

    public void startCopy() {
        System.out.println("Starting black and white copy - parent class");
    }

    public void stopCopy() {
        System.out.println("Stopping photocopy - parent class");
    }

    public void loadPaper() {
        System.out.println("Loading paper - parent class");
    }

    public void showStatus() {
        System.out.println("Showing photocopy machine status - parent class");
    }
}
