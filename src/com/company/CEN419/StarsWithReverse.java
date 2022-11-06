package com.company.CEN419;
import java.util.*;

public class StarsWithReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide number of rows");
        int rows = scanner.nextInt();
        for (int m = rows; m >= 1; m--) {
            for (int n = m; n >= 1; n--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m = 2; m <= rows; m++) {
            for (int n = m; n >= 1; n--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
