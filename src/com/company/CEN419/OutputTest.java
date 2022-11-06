package com.company.CEN419;

public class OutputTest {
    public static void main(String[] args){
        System.out.println(findNumber(1729));
    }
    public static int findNumber(int n){
        while (n>=10){
            int k =0;
            while(n>0){
                k+=n%10;
                n/=10;
            }
            n=k;
        }
        return n;
    }
}
