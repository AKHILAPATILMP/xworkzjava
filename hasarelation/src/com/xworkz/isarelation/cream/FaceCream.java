package com.xworkz.isarelation.cream;

public class FaceCream extends Cream {

    public FaceCream() {
        super();
        System.out.println("FaceCream constructor is running - subclass");
    }

    @Override
    public void apply() {
        System.out.println("Applying face cream on cheeks and forehead - subclass");
    }

    @Override
    public void openLid() {
        System.out.println("Opening face cream lid with seal - subclass");
    }

    @Override
    public void closeLid() {
        System.out.println("Closing face cream lid tightly - subclass");
    }

    @Override
    public void checkExpiry() {
        System.out.println("Checking expiry for face cream - subclass");
    }

    @Override
    public void smell() {
        System.out.println("Smelling fresh aloe vera face cream - subclass");
    }

    public void applySunscreenLayer() {
        System.out.println("Applying sunscreen layer - only in FaceCream");
    }
}
