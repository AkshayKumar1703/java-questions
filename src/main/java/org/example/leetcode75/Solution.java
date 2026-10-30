package org.example.leetcode75;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    //2390. Removing Stars From a String
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                sb.setLength(sb.length() - 1); // pop the last kept character
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

//    1768. Merge Strings Alternately
    public String mergeAlternately(String word1, String word2) {
        String largerWord = "";
        String smallerWord = "";

        String result = "";
        if (word1.length() < word2.length()) {
            smallerWord = word1;
            largerWord = word2;
        }
        else {
            smallerWord = word2;
            largerWord = word1;
        }

        for (int i = 0; i < smallerWord.length(); i++) {
            result = result + word1.charAt(i) + word2.charAt(i);
        }
        result =  result + largerWord.substring(smallerWord.length());

        return result;
    }

//1071. Greatest Common Divisor of Strings
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";

        int result = gcd(str1.length(), str2.length());
        return str1.substring(0,result);
    }
    public static int gcd(int len1, int len2) {
        return len2 == 0 ? len1:gcd(len2,len1%len2);
    }

//1431. Kids With the Greatest Number of Candies
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maximumCandies = 0;

        for (int i = 0; i < candies.length; i++) {
            maximumCandies = Math.max(maximumCandies, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= maximumCandies) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }

//605. Can Place Flowers
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if ((i-1 < 0 || flowerbed[i-1] == 0)
                    && (i+1 >= flowerbed.length || flowerbed[i+1] == 0)) {
                    flowerbed[i] = 1;
                    n--;
                    if (n == 0) return true;
                }
            }
        }
        return false;
    }

//345. Reverse Vowels of a String
    public String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
                while (i < j && !isVowel(letters[i])) {
                    i++;
                }
                while (i < j && !isVowel(letters[j])) {
                    j--;
                }
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
            i++;
            j--;
        }
        return new String (letters);
    }
    public boolean isVowel(char v) {
        return v == 'a' ||  v == 'e' || v == 'i' || v == 'o' || v == 'u'
                || v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U';
    }

//151. Reverse Words in a String
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result = result + words[i] + " ";
        }
        return result.trim();
    }
}
