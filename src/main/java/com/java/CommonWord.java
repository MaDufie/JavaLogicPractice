package com.java;

import java.util.*;

public class CommonWord {
    Map<String, Integer> wordCount = new HashMap<>();
//    List<Map.Entry<String,Integer>> sortedWordCount = sortedList();
            List<String> words = new ArrayList<>(List.of("apple", "coke", "pineapple", "coke", "ice cream", "chocolate",
            "grapes", "coke", "apple", "chocolate", "banana", "ice cream", "chicken", "coke", "chocolate",
            "apple", "chocolate", "banana", "ice cream", "chicken", "coke", "banana", "ice cream", "chocolate",
            "chicken", "coke", "coke", "apple", "pineapple", "grapes", "coke", "apple", "chocolate", "Coffee"));

    public CommonWord() {
        populateMap();
    }

    private void populateMap() {

        // populates map with words and their count
        for (String word : words) {
            int count = wordCount.getOrDefault(word, 0);
            wordCount.put(word, count + 1);
        }
    }
    private List<Map.Entry<String, Integer>> sortedList(Map<String, Integer> wordCount){
        var sortedWordCount = wordCount
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int countComparison = Integer.compare(a.getValue(), b.getValue());
                    if (countComparison != 0)
                        return countComparison;

                    return String.CASE_INSENSITIVE_ORDER.compare(a.getKey(), b.getKey());
                })
                .toList();
        return sortedWordCount;
    }

    public void leastCommonWords(int num){
        var sortedWordCount = sortedList(wordCount);
        if(num < sortedList(wordCount).size()) {
            var LeastCommon = sortedWordCount.subList(0, num);
            System.out.println(num + " Least Common Word: " + LeastCommon);
        }


    }

    public void mostCommonWords(int num){
        var sortedWordCount = sortedList(wordCount);
        if(num < sortedList(wordCount).size()) {
            var mostCommon = sortedWordCount.subList(sortedWordCount.size() - num, sortedWordCount.size());
            System.out.println(num + " Most Common Word: " + mostCommon);
        }
    }

}



