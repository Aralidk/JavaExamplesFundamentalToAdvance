package com.company.CEN419;
import java.util.Scanner;

public class StarsNumEqualsRowReverse {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number of rows");
            int rows = scanner.nextInt();
            for (int i = rows; i >= 0; i--) {
                for (int n = 1; n <= i; n++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }

}
