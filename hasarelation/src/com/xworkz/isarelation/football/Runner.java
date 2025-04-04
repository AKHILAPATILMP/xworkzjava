package com.xworkz.isarelation.football;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Football");
        Football football = new Football();
        football.kick();
        football.pass();
        football.scoreGoal();
        football.showTeam();

        System.out.println("\nCreating an instance of InternationalFootball using Football reference");
        Football footballRef = new InternationalFootball();
        footballRef.kick();
        footballRef.pass();
        footballRef.scoreGoal();
        footballRef.showTeam();

        System.out.println("\nCreating an instance of InternationalFootball using subclass reference");
        InternationalFootball international = new InternationalFootball();
        international.kick();
        international.pass();
        international.scoreGoal();
        international.showTeam();
    }
}
