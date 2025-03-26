package com.xworkz.book;

import com.xworkz.finance.Loan;

public class Runner {
    public static <Finance> void main(String[] args) {
        Loan finance = new Loan(1200000,50,8);
        finance.showLoanDetails();
    }
}
