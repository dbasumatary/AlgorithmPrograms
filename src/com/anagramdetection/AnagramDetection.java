package com.anagramdetection;
import java.util.Arrays;
import java.util.Scanner;

//Checking if two strings are anagrams
public class AnagramDetection {

    public static boolean checkAnagrams(String string1, String string2) {

        //We first check if the two strings have the same length.
        //If they don't, then they cannot be anagrams, and we return false.
        if (string1.length() != string2.length()) {
            return false;
        }

        //Convert both strings to character array
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();

        //Sort both arrays using sort method
        Arrays.sort(array1);
        Arrays.sort(array2);

        //This will return boolean true or false
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = scanner.next();
        System.out.print("Enter the second string: ");
        String string2 = scanner.next();

        if (checkAnagrams(string1, string2)) {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }
    }
}

