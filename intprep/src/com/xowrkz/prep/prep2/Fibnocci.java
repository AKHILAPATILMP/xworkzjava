package com.xowrkz.prep.prep2;
import java.util.Scanner;
public class Fibnocci {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            int a = 0, b = 1, fib = 0;

            for (int i = 2; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }

            if (n == 0)
                fib = 0;
            else if (n == 1)
                fib = 1;

            System.out.println("Fibonacci number at position " + n + " is: " + fib);

            sc.close();
        }
    }


