package com.xworkz.isarelation.bedcover;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of BedCover");
        BedCover cover = new BedCover();
        cover.spreadCover();
        cover.washCover();
        cover.foldCover();
        cover.storeCover();

        System.out.println("\nCreating an instance of BedCoverColor using BedCover reference");
        BedCover colorCoverRef = new BedCoverColor();
        colorCoverRef.spreadCover();
        colorCoverRef.washCover();
        colorCoverRef.foldCover();
        colorCoverRef.storeCover();

        System.out.println("\nCreating an instance of BedCoverColor using subclass reference");
        BedCoverColor colorCover = new BedCoverColor();
        colorCover.spreadCover();
        colorCover.washCover();
        colorCover.foldCover();
        colorCover.storeCover();
    }
}


