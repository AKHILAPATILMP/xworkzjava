package com.xworkz.associate;

public class Project {

        private String projectName;
        private int durationInMonths;

        public Project(String projectName, int durationInMonths) {
            this.projectName = projectName;
            this.durationInMonths = durationInMonths;
        }

        public void displayProjectDetails() {
            System.out.println("Project Name: " + this.projectName);
            System.out.println("Project Duration: " + this.durationInMonths + " months");
        }
    }

