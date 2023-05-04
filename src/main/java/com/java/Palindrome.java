package com.java;

public class Palindrome {
   public boolean isPalindrome(String word){
       int leftIndex = 0;
       int rightIndex = word.length() - 1;

       while (leftIndex < rightIndex) {
           char leftChar = word.charAt(leftIndex);
           char rightChar = word.charAt(rightIndex);
           if (leftChar != rightChar)
               return false;
           leftIndex += 1;
           rightIndex -= 1;
       }

        return true;
   }
}
