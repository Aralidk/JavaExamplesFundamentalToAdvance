package com.company.CEN419;

public class RightStarsWithChar {
    public static void main(String[] args){

        for(int i = 65; i<=75; i++){
            for(int k = i; k>=65; k--){
                System.out.print((char)k + "*");
            }
            System.out.println();
        }
    }
}
