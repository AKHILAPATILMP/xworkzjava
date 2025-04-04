package com.xworkz.isarelation.lens;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Lens");
        Lens lens = new Lens();
        lens.focus();
        lens.capture();
        lens.adjustAperture();
        lens.cleanLens();

        System.out.println("\nCreating an instance of ZoomLens using Lens reference");
        Lens lensRef = new ZoomLens();
        lensRef.focus();
        lensRef.capture();
        lensRef.adjustAperture();
        lensRef.cleanLens();

        System.out.println("\nCreating an instance of ZoomLens using subclass reference");
        ZoomLens zoomLens = new ZoomLens();
        zoomLens.focus();
        zoomLens.capture();
        zoomLens.adjustAperture();
        zoomLens.cleanLens();
    }
}
