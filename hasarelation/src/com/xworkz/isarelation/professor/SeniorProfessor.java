package com.xworkz.isarelation.professor;

    public class SeniorProfessor extends Professor {
        public SeniorProfessor() {
            super();
            System.out.println("SeniorProfessor constructor is running");
        }

        public void publishResearchPaper() {
            System.out.println("SeniorProfessor is publishing a research paper");
        }

        public void mentorJuniorFaculty() {
            System.out.println("SeniorProfessor is mentoring junior faculty members");
        }

        public void headDepartment() {
            System.out.println("SeniorProfessor is heading the department");
        }

        public void approveCurriculum() {
            System.out.println("SeniorProfessor is approving the academic curriculum");
        }

        public void conductSeminar() {
            System.out.println("SeniorProfessor is conducting an international seminar");
        }
    }

