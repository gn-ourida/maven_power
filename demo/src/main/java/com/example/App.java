package com.example;


public class App 
{
    public static double power(Integer number , Integer exponent) {
        double result = 1.0;
        if (number == null || exponent == null){
            throw new IllegalArgumentException("Exception");
        }else{
            if (exponent < 0) {
                for (int i = 0; i < exponent; i++) {
                    result /= number; 
                }
            } else if (exponent > 0) {
                for (int i = 0; i < exponent; i++) {
                    result *= number; 
                }
            } else {
                return result;
            }
        }      
        return result;
    }
}
