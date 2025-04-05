package com.xworkz.isarelation.professor;
public class SeniorProfessor extends Professor {

    public SeniorProfessor() {
        super();
        System.out.println("SeniorProfessor constructor is running - subclass");
    }

    @Override
    public void teach() {
        System.out.println("SeniorProfessor is teaching advanced subjects - subclass");
    }

    @Override
    public void conductExam() {
        System.out.println("SeniorProfessor is conducting viva exams - subclass");
    }

    @Override
    public void evaluatePapers() {
        System.out.println("SeniorProfessor is reviewing research papers - subclass");
    }

    @Override
    public void guideResearch() {
        System.out.println("SeniorProfessor is mentoring PhD students - subclass");
    }
}
