package com.xowrkz.prep.prep2;
import java.util.Scanner;
public class Addition {
    // Import Scanner class

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);  // Create Scanner object

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();   // Read first number

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();   // Read second number

            int sum = num1 + num2;     // Perform addition

            System.out.println("The sum is: " + sum);  // Display result

            sc.close();  // Close the Scanner
        }
    }


