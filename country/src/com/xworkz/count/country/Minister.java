package com.xworkz.count.country;


import com.xworkz.count.experience.Personnel;
import com.xworkz.count.experience.Security;
import com.xworkz.count.experience.Skill;

public class Minister {
    String name;
    PersonalAssistant personalAssistant;
    Skill skill;
    Security security;
    Personnel personnel;

    Minister(String name) {
        this.name = name;
        personalAssistant = new PersonalAssistant();
        skill = new Skill();
        security = new Security();
        personnel = new Personnel();
    }

    void display() {
        System.out.println("    Minister: " + name);
        personalAssistant.display();
        skill.display();
        personnel.display();
        security.display();
    }

}
