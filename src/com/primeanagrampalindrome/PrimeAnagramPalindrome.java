package com.primeanagrampalindrome;

import java.util.Arrays;

//Prime numbers in the range 0 - 1000 that are both anagram and palindrome
public class PrimeAnagramPalindrome {

    //Numbers 0 and 1 are neither prime nor composite
    public static boolean isPrime(int number) {
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

    public static boolean checkAnagram(int number) {

        //convert the number to string first and then sort the characters
        String string1 = Integer.toString(number);
        char[] array1 = string1.toCharArray();
        Arrays.sort(array1);
        String sorted1 = new String(array1);

        //Iterate over all numbers greater than the given number and between 1000
        //and after sort we convert it to string, sort it and then compare it to
        // our previous sorted number and if match found it returns true
        for (int i = number + 1; i <= 1000; i++) {
            String string2 = Integer.toString(i);
            char[] array2 = string2.toCharArray();
            Arrays.sort(array2);
            String sorted2 = new String(array2);

            if (sorted1.equals(sorted2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPalindrome(int number) {

        //convert the number to string first
        String string = Integer.toString(number);
        int i = 0, j = string.length() - 1;

        while (i < j) {
            //we now convert number to a char and iterate over its characters
            // from both ends, comparing them as we go.
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }

            //increment from lower end and decrement from higher end
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        int low = 0, high = 1000;
        System.out.println("Prime numbers between " + low + " and " + high + " that are anagrams and palindromes are: ");

        //checking for prime, anagram and palindrome
        for (int i = low; i <= high; i++) {
            if (isPrime(i) && checkAnagram(i) && checkPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
