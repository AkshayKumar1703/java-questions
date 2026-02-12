package org.example.algorithms;

import java.util.ArrayList;
import java.util.List;

public class RecursionExamples {
    //fibonacci solution using recursion

    public  int fibonacci(int n) {
        if (n == 1 || n == 2 || n == 3) {
            return n - 1;
        }
        int firstTerm = fibonacci(n - 1);
        int secondTerm = fibonacci(n - 2);
        int thirdTerm = fibonacci(n - 3);
        return firstTerm + secondTerm + thirdTerm;
    }
// Reverse a list using recursion
    public  List<Integer> recursivePrint(List<Integer> numbers) {

        if (numbers.isEmpty()) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.add(numbers.get(numbers.size() - 1));
        result.addAll(recursivePrint(numbers.subList(0, numbers.size()-1)));
        return result;
    }

}
