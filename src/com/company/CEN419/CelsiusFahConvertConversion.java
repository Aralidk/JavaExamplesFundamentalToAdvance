package com.company.CEN419;

public class CelsiusFahConvertConversion {
    public static void main(String[] args){
        System.out.println("Celsius     Fahrenheit     |  Fahrenheit     Celsius");
        System.out.println("----------------------------------------------------");
        double fahrenheit;
        double celsius;
        double c = 40.0;
        double f = 120.0;

        while(c>= 31.0 && f>=30.0){
            fahrenheit = celsiusToFahrenheit(c);
            celsius = fahrenheitToCelsius(f);
            System.out.printf("%-11.2f%-15.2f" + " | " + "%-15.2f%-11.2f" + "\n" , c,f,celsius,fahrenheit);
            c -=1.0;
            f -=10.0;
        }
    }

    public static double celsiusToFahrenheit(double celsius){
        var fahrenheit = (9.0 / 5) * celsius +32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        var celsius = (5.0/ 9) * (fahrenheit - 32);
        return celsius;
    }

}
