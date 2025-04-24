package com.xowrkz.prep.prep2;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] n = new int[10];
        System.out.println("Enter only 10 numbers (space-separated):");
        for (int i = 0; i < 10; i++) {
            if (s.hasNextInt()) {
                n[i] = s.nextInt();
            } else {
                System.out.println("Invalid input. Enter integers.");
                s.next();
                i--;
            }
        }
        Arrays.sort(n);
        System.out.println("\nSorted descending:");
        for (int i = 9; i >= 0; i--) System.out.print(n[i] + " ");
        System.out.println();
        s.close();
    }
}