package org.example.datastructure;

import java.util.HashMap;
import java.util.List;

public class HashingExamples {
    public static void twoSum(int target, List<Integer> numbers) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            numberMap.put( numbers.get(i), i);
            int current = numbers.get(i);
            int compliment = target - current;

            if (numberMap.containsKey(compliment)) {
                System.out.println(numberMap.get(compliment) + i);
                return;
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        int target  = 7;
        twoSum(target,numbers);
    }
}