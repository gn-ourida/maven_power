package com.example;

/**
 * This class provides a method to calculate the power of a given number raised to a specified exponent.
 */
public class App {

    /**
     * Calculates the power of a given number raised to a specified exponent.
     *
     * @param number   the base number
     * @param exponent the exponent
     * @return the result of raising the number to the power of the exponent
     * @throws IllegalArgumentException if either number or exponent is null
     */
    public static double power(Integer number, Integer exponent) {
        // Initialize the result
        double result = 1.0;
        
        // Check if either number or exponent is null, and throw an exception if so
        if (number == null || exponent == null) {
            throw new IllegalArgumentException("Exception");
        } else {
            // Handle the case when the exponent is negative
            if (exponent < 0) {
                for (int i = 0; i < exponent; i++) {
                    result /= number;
                }
            } 
            // Handle the case when the exponent is positive
            if (exponent > 0) {
                for (int i = 0; i < exponent; i++) {
                    result *= number;
                }
            } 
            // Handle the case when the exponent is zero
            if (exponent == 0) {
                return result;
            }
        }
        // Return the result
        return result;
    }
}

