package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.HairDryer;

public class ProfessionalHairDryer implements HairDryer {

    @Override
    public void dryHair() {
        System.out.println("Drying hair with warm air...");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Adjusting the drying speed...");
    }

    @Override
    public void coolDown() {
        System.out.println("Activating cool down mode...");
    }
}
