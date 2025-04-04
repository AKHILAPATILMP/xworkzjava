package com.xworkz.isarelation.bedcover;
public class BedCoverColor extends BedCover {

    public BedCoverColor() {
        super();
        System.out.println("BedCoverColor constructor is running - subclass");
    }

    @Override
    public void spreadCover() {
        System.out.println("Spreading colorful bed cover - subclass");
    }

    @Override
    public void washCover() {
        System.out.println("Washing colored bed cover gently - subclass");
    }

    @Override
    public void foldCover() {
        System.out.println("Folding colored bed cover neatly - subclass");
    }

    @Override
    public void storeCover() {
        System.out.println("Storing colored bed cover in wardrobe - subclass");
    }
}
