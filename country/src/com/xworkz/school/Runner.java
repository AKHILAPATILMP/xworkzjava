package com.xworkz.school;

// Importing classes from different packages
import com.xworkz.company.Employee;
import com.xworkz.company.Manager;

public class Runner {
    public static void main(String[] args) {

        Employee emp = new Employee("Alice", 50000, "HR");
        emp.showDetails();
        Manager mgr = new Manager("Bob", 70000, "IT", "Development");
        mgr.showManagerInfo();
        Student stu = new Student("Charlie", 85, "A");
        stu.showInfo();
    }
}
