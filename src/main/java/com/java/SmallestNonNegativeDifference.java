package com.java;

import java.util.*;

public class SmallestNonNegativeDifference {

    public void smallestDifference(int[] arr1, int[] arr2){

         Map<Map<Integer, Integer>, Integer> results = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int diff = arr2[j] - arr1[i];
                results.put(Map.of(arr1[i], arr2[j]), diff);
            }
        }
        System.out.println(results.entrySet());
    }
}
