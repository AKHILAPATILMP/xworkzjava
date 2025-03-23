package com.xworkz.count.experience;

public class Skill {
    Experience experience;

    public Skill() {
        experience = new Experience();
    }

    public void display() {
        System.out.println("  Skill: Leadership");
        experience.display();
    }

}
