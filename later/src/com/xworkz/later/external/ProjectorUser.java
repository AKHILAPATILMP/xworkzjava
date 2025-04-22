package com.xworkz.later.external;

import com.xworkz.later.internal.Projector;

public class ProjectorUser {

    Projector projector;

    public ProjectorUser(Projector projector) {
        this.projector = projector;
        System.out.println("ProjectorUser is initialized");
    }

    public void activate() {
        if (this.projector != null) {
            this.projector.project();
        } else {
            System.out.println("No projector to project");
        }
    }
}
