package com.xworkz.isarelation.lens;

public class ZoomLens extends Lens {

    public ZoomLens() {
        super();
        System.out.println("ZoomLens constructor is running - subclass");
    }

    @Override
    public void focus() {
        System.out.println("ZoomLens is auto-focusing - subclass");
    }

    @Override
    public void capture() {
        System.out.println("ZoomLens capturing with high zoom - subclass");
    }

    @Override
    public void adjustAperture() {
        System.out.println("ZoomLens adjusting aperture based on lighting - subclass");
    }

    @Override
    public void cleanLens() {
        System.out.println("ZoomLens cleaning with smart sensor - subclass");
    }
}

