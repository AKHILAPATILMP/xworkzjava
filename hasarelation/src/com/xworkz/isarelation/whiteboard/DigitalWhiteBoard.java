package com.xworkz.isarelation.whiteboard;
public class DigitalWhiteBoard extends WhiteBoard {

    public DigitalWhiteBoard() {
        super();
        System.out.println("DigitalWhiteBoard constructor is running - subclass");
    }

    @Override
    public void write() {
        System.out.println("Writing on the digital whiteboard with stylus - subclass");
    }

    @Override
    public void erase() {
        System.out.println("Erasing content with one tap - subclass");
    }

    @Override
    public void clean() {
        System.out.println("Auto-cleaning the digital whiteboard - subclass");
    }

    @Override
    public void displaySurface() {
        System.out.println("Displaying interactive digital surface - subclass");
    }
}


