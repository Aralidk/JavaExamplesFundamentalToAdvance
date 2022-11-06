package com.company.CEN419;

import java.util.Scanner;

public class StarTree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide number of rows");
        int rows = scanner.nextInt();
        for (int m = 1; m <= rows; m++)
        {
            for (int n=rows; n>m; n--)
            {
                System.out.print(" ");
            }
            for (int p=1; p<=(m * 2) -1; p++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        }
}
