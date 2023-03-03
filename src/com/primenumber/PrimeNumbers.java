package com.primenumber;

//Prime numbers in the range 0 - 1000
public class PrimeNumbers {
    public static boolean checkPrime(int number) {

        //Numbers 0 and 1 are neither prime nor composite
        if (number <= 1) {
            return false;
        }

        //every composite number has a prime factor
        // less than or equal to its square root.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int start = 0, end = 1000;

        System.out.println("Prime numbers between " + start + " and " + end + " are: ");

        for (int i = start; i <= end; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
