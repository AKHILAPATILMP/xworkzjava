package com.xworkz.inherit.multirun;

import com.xworkz.inherit.multi.MobileCover;

public class Run1 {
    public static void main(String[] args) {
        MobileCover mobileCover = new MobileCover();
        mobileCover.protect();      // Inherited from Cover
        mobileCover.flexibility();  // Inherited from PlasticCover
        mobileCover.fitMobile();    // Own method in MobileCover
    }
}
