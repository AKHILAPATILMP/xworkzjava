package com.xworkz.company;

public class Employee {
        public String name;
        double salary;
        private final String department;

        public Employee(String name, double salary, String department) {
            this.name = name;
            this.salary = salary;
            this.department = department;
            showDetails(); // Calling within the same class
        }

        public void showDetails() { // Public method
            System.out.println("Employee: " + name + ", Salary: $" + salary);
            showDepartment();
        }

        void showSalary() { // Package-level method
            System.out.println("Salary: $" + salary);
        }

        private void showDepartment() { // Private method
            System.out.println("Department: " + department);
        }
    }


