package com.xworkz.school;

public class Teacher {

        public String teacherName;
        String subject;
        private int experience;

        public Teacher(String name, String subject, int experience) {
            this.teacherName = name;
            this.subject = subject;
            this.experience = experience;
            showDetails();
        }

        public void showDetails() {
            System.out.println("Teacher: " + teacherName + ", Subject: " + subject);
            showExperience();
        }

        void showSubject() {
            System.out.println("Teaching: " + subject);
        }

        private void showExperience() {
            System.out.println("Experience: " + experience + " years");
        }
    }


