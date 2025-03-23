package com.xworkz.count.experience;

public class Experience {
    ExperienceDetail[] details = new ExperienceDetail[1];

    Experience() {
        details[0] = new ExperienceDetail();
    }

    void display() {
        for (ExperienceDetail detail : details) detail.display();
    }
}
