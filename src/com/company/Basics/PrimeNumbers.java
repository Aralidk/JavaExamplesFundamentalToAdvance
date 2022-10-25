package com.company.Basics;

public class PrimeNumbers {
    static int number = 25;
    static boolean isPrime = false;
    public static void Primes(){
        for(int i =2 ; i< number; i++){
            if(number % i == 0){
                isPrime = true;
            }
        }
        if(isPrime){
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("Number is prime");
        }

    }
}
