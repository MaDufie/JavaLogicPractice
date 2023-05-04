package com.java;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
    public boolean isPalindromePermutation(String word){
        //todo: count each character
        //todo: if all even, palindrome
        //todo: if all but one is a palindrome
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            int count = charCount.getOrDefault(word.charAt(i), 0);
            charCount.put(word.charAt(i), count + 1);
        }
        int odd = 0;
        for(int i: charCount.values()){
            if(i % 2 != 0){
                odd++;
            }
        }
        return odd <= 1;
    }
}
