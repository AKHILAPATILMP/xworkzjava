package com.xworkz.count.experience;

public class Personnel {
    Skill skill;

    public Personnel() {
        skill = new Skill();
    }

    public void display() {
        System.out.println("Personnel Information:");
        skill.display();
    }
}
