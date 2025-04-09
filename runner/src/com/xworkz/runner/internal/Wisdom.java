package com.xworkz.runner.internal;

public class Wisdom {
    private int yearsOfExperience;
    private String lessonLearned;
    private String guidingPrinciple;

    public Wisdom(int yearsOfExperience, String lessonLearned, String guidingPrinciple) {
        this.yearsOfExperience = yearsOfExperience;
        this.lessonLearned = lessonLearned;
        this.guidingPrinciple = guidingPrinciple;
    }

    @Override
    public String toString() {
        return "[yearsOfExperience=" + yearsOfExperience + ", lessonLearned=" + lessonLearned + ", guidingPrinciple=" + guidingPrinciple + "]";
    }
}
