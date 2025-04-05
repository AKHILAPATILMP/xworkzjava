package com.xworkz.isarelation.spacestation;
public class ResearchSpaceStation extends SpaceStation {

    public ResearchSpaceStation() {
        super();
        System.out.println("ResearchSpaceStation constructor is running - subclass");
    }

    @Override
    public void launch() {
        System.out.println("ResearchSpaceStation is launched with scientific modules - subclass");
    }

    @Override
    public void orbit() {
        System.out.println("ResearchSpaceStation is in low Earth orbit conducting experiments - subclass");
    }

    @Override
    public void maintainSystems() {
        System.out.println("ResearchSpaceStation is auto-maintaining systems with AI - subclass");
    }

    @Override
    public void communicate() {
        System.out.println("ResearchSpaceStation communicates via encrypted satellite channels - subclass");
    }
}




