package com.xworkz.isarelation.football;
public class InternationalFootball extends Football {

    public InternationalFootball() {
        super();
        System.out.println("InternationalFootball constructor is running - subclass");
    }

    @Override
    public void kick() {
        System.out.println("Kicking with international level power - subclass");
    }

    @Override
    public void pass() {
        System.out.println("Passing with precision in international match - subclass");
    }

    @Override
    public void scoreGoal() {
        System.out.println("Scoring a goal in World Cup match - subclass");
    }

    @Override
    public void showTeam() {
        System.out.println("Showing national football team - subclass");
    }
}
