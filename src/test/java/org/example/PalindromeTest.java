package org.example;

import org.example.algorithms.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome palindrome = new Palindrome();

    @Test
    void shouldReturnTruePalindrome() {
        String str = "Nitin";
        boolean result = palindrome.palindrome(str);
        assertTrue(result);
    }

    @Test
    void shouldReturnFalsePalindrome() {
        String str = "race";
        boolean result = palindrome.palindrome(str);
        assertFalse(result);
    }

    @Test
    void shouldHandleNumericStringPalindrome() {
        String str = "121";
        boolean result = palindrome.palindrome(str);
        assertTrue(result);
    }
}