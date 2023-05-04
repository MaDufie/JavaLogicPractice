package com.java;

public class UniqueCharacters {
    public boolean isUnique(String word){

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(word.indexOf(c) != word.lastIndexOf(c)){
                return false;
            }
        }
        return true;
    }
}
