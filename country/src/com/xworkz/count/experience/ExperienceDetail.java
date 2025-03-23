package com.xworkz.count.experience;

public class ExperienceDetail {
    Company company;
    Education[] education = new Education[2];

    ExperienceDetail() {
        company = new Company("Tech Innovators");
        education[0] = new Education("B.Tech");
        education[1] = new Education("M.Tech");
    }

    void display() {
        company.display();
        for (Education edu : education) edu.display();
    }

}
