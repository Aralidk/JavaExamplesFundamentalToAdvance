package com.company.CEN419;
import java.util.*;

public class CheerLeader {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a line number");
        int lines = scanner.nextInt();
        System.out.println("Please provide a cheer number");
        int cheers = scanner.nextInt();
        cheerLeader(lines,cheers);
    }

    public static void cheerLeader(int lines, int cheers){
        for(int line =0; line<lines; line++){
            for(int space = 1; space<=line *3; space++){
                System.out.print(" ");
            }
            System.out.print("Go");
            for(int cheer = 2; cheer<=cheers; cheer++){
                System.out.print(" Team Go");
            }
            System.out.println();
        }

    }
}
