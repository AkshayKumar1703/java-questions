package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecursionExamplesTest {
    RecursionExamples recursionexamples = new RecursionExamples();

    @Test
    void shouldGiveSumOfFibonacci() {
        int n = 5;
        int result = recursionexamples.fibonacci(n);
        assertEquals(6, result);

    }

    @Test
    void recursivePrint() {

        List<Integer> numbers = Arrays.asList(2, 3, 4, 7, 8, 9, 10, 6, 1);
        List<Integer> expected = Arrays.asList(1, 6, 10, 9, 8, 7, 4, 3, 2);
        List<Integer> actual = recursionexamples.recursivePrint(numbers);
        assertEquals(expected, actual);
    }
}