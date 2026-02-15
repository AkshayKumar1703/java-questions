package org.example.datastructure;

import java.util.Arrays;
import java.util.List;

class BinarySearchTreeTest {

    public static class BSTTest {

        public static void main(String[] args) {

            // Test Case 1: Sorted input
            List<Integer> test1 = Arrays.asList(1, 2, 3, 4, 5);
            runTest("Sorted Input", test1);

            // Test Case 2: Random input
            List<Integer> test2 = Arrays.asList(50, 30, 70, 20, 40, 60, 80);
            runTest("Random Input", test2);

            // Test Case 3: With duplicates
            List<Integer> test3 = Arrays.asList(10, 30, 20, 30, 5, 15);
            runTest("With Duplicates", test3);

            // Test Case 4: Single element
            List<Integer> test4 = Arrays.asList(100);
            runTest("Single Element", test4);

            // Test Case 5: Empty input
            List<Integer> test5 = Arrays.asList();
            runTest("Empty Input", test5);
        }

        public static void runTest(String testName, List<Integer> numbers) {
            System.out.println("---- " + testName + " ----");
            System.out.println("Input: " + numbers);

            BinarySearchTree bst = new BinarySearchTree();

            for (int num : numbers) {
                bst.insert(num);
            }

            System.out.print("Sorted Output: ");
            bst.printInOrder();
            System.out.println();
        }
    }
}