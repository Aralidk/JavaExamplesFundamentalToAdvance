package com.company.Basics;

public class FriendNumbers {

    public static void FindFriendNumbers(int numberOne, int numberTwo, int totalOne, int totalTwo) {
        for (int i = 1; i < numberOne; i++) {
            if (numberOne % i == 0) {
                totalOne = totalOne + i;
            }
        }
        for (int i = 1; i < numberTwo; i++) {
            if (numberTwo % i == 0) {
                totalTwo = totalTwo + i;
            }
        }
        if(totalOne == numberTwo && totalTwo == numberOne){
            System.out.println("These are Friend Numbers");
        }
        else{
            System.out.println("These are not Friend Numbers");
        }
    }
}
