package com.company.BasicsAndConditionStatements;

public class FindNumber {

    public static void getFindingNumber(int[] numbers, int findingNumber) {
        for(int number : numbers){
            if(number == findingNumber){
             System.out.println("Number found!");
             break;
            }
            else{System.out.println("Number can not found!");}
        }
    }
}
