package com.xworkz.education;

public class University {
        public String universityName;
        int numOfStudents;
        private String location;

        public University(String universityName, int numOfStudents) {
            this.universityName = universityName;
            this.numOfStudents = numOfStudents;
            this.location = location;
        }

        public void showUniversity() {
            System.out.println("University: " + universityName + ", Students: " + numOfStudents);
            showLocation();
        }

        void showNumOfStudents() {
            System.out.println("Number of Students: " + numOfStudents);
        }

        private void showLocation() {
            System.out.println("Location: " + location);
        }
    }


