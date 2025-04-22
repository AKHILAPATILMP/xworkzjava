package com.xworkz.later.internal;

public class ProjectorImpl implements Projector {

    public ProjectorImpl() {
        super();
        System.out.println("ProjectorImpl constructor running");
    }

    @Override
    public void project() {
        System.out.println("Projector is projecting...");
    }
}
