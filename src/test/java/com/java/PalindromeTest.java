package com.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void TestReturnTrueIfPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertTrue(palindrome.isPalindrome("madam"));
    }

    @Test
    void TestReturnFalseIfNotPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertFalse(palindrome.isPalindrome("dudu"));
    }
}