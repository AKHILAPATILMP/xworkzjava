package com.xworkz.isarelation.lock;

public class Lock {
        public Lock() {
            System.out.println("Lock constructor is running");
        }

        public void lock() {
            System.out.println("Lock is secured");
        }

        public void unlock() {
            System.out.println("Lock is opened");
        }

        public void checkStatus() {
            System.out.println("Checking lock status");
        }

        public void rustProof() {
            System.out.println("Lock is rust-proof");
        }

        public void breakLock() {
            System.out.println("Lock is broken");
        }
    }

