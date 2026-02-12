package org.example.algorithms;

public class Palindrome {

    public  boolean palindrome(String str) {
        String originalString = str;
        String reverseString = "";

        // Build reversed string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }

        if (originalString.equalsIgnoreCase(reverseString)) {
            System.out.println(originalString + " is a palindrome String");
            return true;
        } else {
            System.out.println(originalString + " is not a palindrome String");
            return false;
        }

    }
}
