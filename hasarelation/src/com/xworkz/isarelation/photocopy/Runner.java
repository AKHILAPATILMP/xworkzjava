package com.xworkz.isarelation.photocopy;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Photocopy");
        Photocopy photocopy = new Photocopy();
        photocopy.startCopy();
        photocopy.stopCopy();
        photocopy.loadPaper();
        photocopy.showStatus();

        System.out.println("\nCreating an instance of ColorPhotocopy using Photocopy reference");
        Photocopy pcRef = new ColorPhotocopy();
        pcRef.startCopy();
        pcRef.stopCopy();
        pcRef.loadPaper();
        pcRef.showStatus();

        System.out.println("\nCreating an instance of ColorPhotocopy using subclass reference");
        ColorPhotocopy colorCopy = new ColorPhotocopy();
        colorCopy.startCopy();
        colorCopy.stopCopy();
        colorCopy.loadPaper();
        colorCopy.showStatus();
    }
}


