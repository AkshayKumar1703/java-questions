package org.example.leetcode;

public class questions {
//    26. Remove Duplicates from Sorted Array
    public int removeDuplicates(int[] nums) {
        if ( nums.length == 0) {
            return 0;
        }
        int idx = 0;
        for ( int i = 1; i < nums.length; i++){
            if ( nums[i]!= nums[idx]) {
                idx++;
                nums[idx] = nums[i];
            }
        }
        return idx + 1;
    }

// Given a string s consisting of words and spaces, return the length of the last word in the string.
    public static int lengthOfLastWord(String s) {
            String[] word = s.split(" ");
            String lastWord = word[word.length - 1];
            return lastWord.length();
        }

// 28. Find the Index of the First Occurrence in a String
/*Given two strings needle and haystack, return the index of
    the first occurrence of needle in haystack,
    or -1 if needle is not part of haystack.*/
    public static int strStr(String s) {

    }



//125. Valid Palindrome
/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
    and removing all non-alphanumeric characters, it reads the same forward
    and backward. Alphanumeric characters include letters and numbers.*/

    public  static boolean isPalindrome(String s) {

    }



}
