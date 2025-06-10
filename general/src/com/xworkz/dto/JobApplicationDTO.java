package com.xworkz.dto;

public class JobApplicationDTO {
    private String name;
    private String email;
    private String education;
    private String skills;
    private String expectedSalary;
    private String experience;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getEducation() { return education; }
    public void setEducation(String education) { this.education = education; }

    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }

    public String getExpectedSalary() { return expectedSalary; }
    public void setExpectedSalary(String expectedSalary) { this.expectedSalary = expectedSalary; }

    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }
}
