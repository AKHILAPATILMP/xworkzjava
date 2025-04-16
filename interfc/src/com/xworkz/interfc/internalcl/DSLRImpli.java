package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Camera;

public class DSLRImpli implements Camera {

    @Override
    public void capturePhoto() {
        System.out.println("DSLR capturing photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("DSLR recording video");
    }

    @Override
    public void zoom() {
        System.out.println("DSLR zooming");
    }
}
