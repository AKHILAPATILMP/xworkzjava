package com.xworkz.vechile;

import com.xworkz.finance.BankAccount;
import com.xworkz.finance.Loan;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car("Honda", 150, "SUV");
        car.drive();
        Bike bike=new Bike("Ducati", 120, "Sport");
        bike.ride();
        BankAccount carAccount = new BankAccount("John Doe", 10000, "Savings");
        Loan carLoan = new Loan(20000, 5.5, 48);

        BankAccount bikeAccount = new BankAccount("Alice Smith", 4000, "Current");
        Loan bikeLoan = new Loan(8000, 6.0, 24);
    }
}
