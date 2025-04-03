package com.xworkz.isarelation.professor;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SeniorProfessor using Professor reference");
            Professor professorRef = new SeniorProfessor();
            professorRef.teach();
            professorRef.conductExam();
            professorRef.evaluatePapers();
            professorRef.guideStudents();
            professorRef.attendMeeting();

            System.out.println("\nCreating an instance of SeniorProfessor using subclass reference");
            SeniorProfessor seniorProfessor = new SeniorProfessor();
            seniorProfessor.teach();
            seniorProfessor.conductExam();
            seniorProfessor.evaluatePapers();
            seniorProfessor.guideStudents();
            seniorProfessor.attendMeeting();
            seniorProfessor.publishResearchPaper();
            seniorProfessor.mentorJuniorFaculty();
            seniorProfessor.headDepartment();
            seniorProfessor.approveCurriculum();
            seniorProfessor.conductSeminar();
        }
    }

