package com.xworkz.school;

public class Student {

        public String studentName;
        int marks;
        private String grade;

        public Student(String name, int marks, String grade) {
            this.studentName = name;
            this.marks = marks;
            this.grade = grade;
            showInfo();
        }

        public void showInfo() {
            System.out.println("Student: " + studentName + ", Marks: " + marks);
            showGrade();
        }

        void showMarks() {
            System.out.println("Marks: " + marks);
        }

        private void showGrade() {
            System.out.println("Grade: " + grade);
        }
    }


