package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.Blender;
import com.xworkz.interfc.externali.Boat;

public class Animal implements Blender, Boat {
    @Override
    public void sail() {
        System.out.println("sail");
    }

    @Override
    public void anchor() {
        System.out.println("anchor");
    }

    @Override
    public void navigate() {
        System.out.println("navigate");
    }

    @Override
    public void blend() {
        System.out.println("blend");
    }

    @Override
    public void chop() {
        System.out.println("chop");
    }

    @Override
    public void pulse() {
        System.out.println("pulse");
    }
    @Override
    public void move(){
        System.out.println("boat moves");
    }
}
