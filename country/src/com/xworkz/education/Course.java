package com.xworkz.education;

public class Course {
        public String courseName;
        int duration;
        private String instructor;

        public Course(String courseName, int duration) {
            this.courseName = courseName;
            this.duration = duration;
            this.instructor = instructor;
        }

        public void showCourse() {
            System.out.println("Course: " + courseName + ", Duration: " + duration + " months");
            showInstructor();
        }

        void showDuration() {
            System.out.println("Duration: " + duration + " months");
        }

        public void showInstructor() {
            System.out.println("Instructor: " + instructor);
        }
    }


