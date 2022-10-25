package com.company.Basics;

public class PerfectNumber {

    public static void isPerfect() {
        int number = 9;
        int total = 0;
        for( int initial =1; initial< number; initial++){
            if(number % initial ==0){
                total = total + initial;
            }
        }
        if(number == total){
            System.out.println("Number is Perfect Number");
        }
        else{
            System.out.println("Number is not Perfect Number");
        }
    }

}
