package com.xworkz.finance;

import com.xworkz.education.Course;
import com.xworkz.education.University;

public class Runner {
    public static void main(String[] args) {
        Course course = new Course("Computer Science", 4);
        course.showInstructor();;
        University university = new University("Oxford University", 5000000);
        university.showUniversity();
    }
}
