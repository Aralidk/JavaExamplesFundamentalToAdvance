package com.company.BasicsAndConditionStatements;
import java.util.ArrayList;
import java.util.Arrays;

public class DivideableWithTwo {
   public static String divideable() {
       int[] primeNumbers = {2,3,4,5,6,7,10,12,13};
       ArrayList<Integer> absolutePrime =  new ArrayList<Integer>(Arrays.asList());
       ArrayList<Integer> notPrime = new ArrayList<Integer>(Arrays.asList());;

       for (int i = 0; i < primeNumbers.length; i++) {
           if(primeNumbers[i]%2 == 0 ) {
               absolutePrime.add(primeNumbers[i]);
               System.out.println("**************"+absolutePrime +"**************");
           }
           else {
               notPrime.add(primeNumbers[i]);
               System.out.println("---------------"+notPrime + "---------");
           }
       }
       return absolutePrime.toString();
   }
}
