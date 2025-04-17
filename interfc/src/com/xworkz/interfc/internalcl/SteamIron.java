package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Iron;

public class SteamIron implements Iron {
    @Override
    public void heat() {
        System.out.println("heat");
    }

    @Override
    public void ironClothes() {
        System.out.println("ironed ones");
    }

    @Override
    public void steam() {
        System.out.println("steam");
    }

    @Override
    public void post() {

    }
}
