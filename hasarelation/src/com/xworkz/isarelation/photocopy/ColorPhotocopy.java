package com.xworkz.isarelation.photocopy;


public class ColorPhotocopy extends Photocopy {

    public ColorPhotocopy() {
        super();
        System.out.println("ColorPhotocopy constructor is running - subclass");
    }

    @Override
    public void startCopy() {
        System.out.println("Starting color photocopy - subclass");
    }

    @Override
    public void stopCopy() {
        System.out.println("Stopping color photocopy - subclass");
    }

    @Override
    public void loadPaper() {
        System.out.println("Loading glossy paper for color copy - subclass");
    }

    @Override
    public void showStatus() {
        System.out.println("Color photocopy machine status: Ready - subclass");
    }
}
