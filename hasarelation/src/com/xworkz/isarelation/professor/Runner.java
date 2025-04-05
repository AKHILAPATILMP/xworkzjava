package com.xworkz.isarelation.professor;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Professor");
        Professor professor = new Professor();
        professor.teach();
        professor.conductExam();
        professor.evaluatePapers();
        professor.guideResearch();

        System.out.println("\nCreating an instance of SeniorProfessor using Professor reference");
        Professor ref = new SeniorProfessor();
        ref.teach();
        ref.conductExam();
        ref.evaluatePapers();
        ref.guideResearch();

        System.out.println("\nCreating an instance of SeniorProfessor using subclass reference");
        SeniorProfessor senior = new SeniorProfessor();
        senior.teach();
        senior.conductExam();
        senior.evaluatePapers();
        senior.guideResearch();
    }
}
