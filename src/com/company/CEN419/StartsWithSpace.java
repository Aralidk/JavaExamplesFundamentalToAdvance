package com.company.CEN419;

import java.util.Scanner;

public class StartsWithSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide number of rows to print... ");
        int rows = scanner.nextInt();
        for (int m = 1; m <= rows; m++) {
            for (int n = rows - 1; n >= m; n--) {
                System.out.print(" ");
            }
            for (int p = 1; p <= rows; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
