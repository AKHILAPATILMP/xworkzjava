package com.xworkz.later.runner;

import com.xworkz.later.internal.Projector;
import com.xworkz.later.internal.ProjectorImpl;
import com.xworkz.later.external.ProjectorUser;

public class ProjectorRunner {
    public static void main(String[] args) {
        Projector projector = new ProjectorImpl();
        ProjectorUser projectorUser = new ProjectorUser(projector); // abstraction
        projectorUser.activate();
    }
}
