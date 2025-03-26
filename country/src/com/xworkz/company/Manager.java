package com.xworkz.company;
    public class Manager extends Employee {
        public String team;

        public Manager(String name, double salary, String department, String team) {
            super(name, salary, department);
            this.team = team;
        }

        public void showManagerInfo() {
            showDetails();
            System.out.println("Manages team: " + team);
        }
    }


