package org.example.leetcode;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class questions {
    //    26. Remove Duplicates from Sorted Array
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[idx]) {
                idx++;
                nums[idx] = nums[i];
            }
        }
        return idx + 1;
    }

    // Buy and sell stock
    // brute force
    class Solution {
        public int maxProfit(int[] prices) {
            int max = 0;
            for (int b = 0; b < prices.length; b++) {
                int profit = 0;
                for (int s = b + 1; s < prices.length; s++) {
                    if (profit < (prices[s] - prices[b])) {
                        profit = prices[s] - prices[b];
                    }
                }
                max = Math.max(max, profit);
            }
            return max;
        }
    }

    // Optimise Solution
    public int maxProfit2(int[] prices) {
        int[] rightMax = new int[prices.length];
        rightMax[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(prices[i], rightMax[i + 1]);
        }
        //System.out.print(Arrays.toString(rightMax));
        int max = 0;
        for (int b = 0; b < prices.length; b++) {
            int profit = rightMax[b] - prices[b];
            max = Math.max(max, profit);
        }
        return max;
    }
//[7,6,6,6,6,4]


    //    252. Meeting Rooms
    //Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
    public static void main(String[] args) {
        List<List<Integer>> numbers = List.of(List.of(0, 30), List.of(5, 10), List.of(15, 20)); // 0,30  25,50
        List<List<Integer>> number2 = List.of(List.of(0, 30), List.of(25, 50));

        System.out.println(interval(number2));
    }

    private static boolean interval(List<List<Integer>> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            List<Integer> firstMeeting = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) {
                List<Integer> secondMeeting = numbers.get(j);
                if (firstMeeting.getLast() > secondMeeting.getFirst() &&
                        firstMeeting.getFirst() < secondMeeting.getLast()) {
                    return false;
                }
            }
        }
        return true;
    }

    //    253. Meeting Rooms II
//    Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.
    public static class Interval {
        Integer time;
        String type;

        Interval(Integer time, String type) {
            this.time = time;
            this.type = type;
        }

        @Override
        public String toString() {
            String s = this.time + ":" + this.type;
            return s;
        }
    }

    private static Integer checkIntervals(List<List<Integer>> intervalList) {
        List<Interval> intervals = new ArrayList<>();
        for (List<Integer> i : intervalList) {
            intervals.add(new Interval(i.getFirst(), "s"));
            intervals.add(new Interval(i.getLast(), "e"));
        }
        Collections.sort(intervals, (i1, i2) -> i1.time - i2.time);
        System.out.println(intervals);
        Integer count = 0;
        Integer minRooms = 0;
        for (Interval i : intervals) {
            if (i.type.equalsIgnoreCase("s")) {
                count = count + 1;
            } else {
                count = count - 1;
            }
            minRooms = Math.max(minRooms, count);
        }
        return minRooms;
    }

    /*        public static void main(String[] args) {
            List<List<Integer>> intervalList = List.of(List.of(0, 30), List.of(5, 10), List.of(15, 20));
            System.out.println(checkIntervals(intervalList));
        }*/
    //    252. Meeting Rooms.
    //    Meeting Room optimise solution
    class Solution1 {
        public static class Interval {
            Integer time;
            String type;

            Interval(Integer time, String type) {
                this.time = time;
                this.type = type;
            }

            @Override
            public String toString() {
                String s = this.time + ":" + this.type;
                return s;
            }
        }

        private static boolean checkIntervals(List<List<Integer>> intervalList) {
            List<Interval> intervals = new ArrayList<>();
            for (List<Integer> i : intervalList) {
                intervals.add(new Interval(i.getFirst(), "s"));
                intervals.add(new Interval(i.getLast(), "e"));
            }
            Collections.sort(intervals, (i1, i2) -> i1.time - i2.time);
            System.out.println(intervals);
            int count = 0;
            for (Interval i : intervals) {
                if (i.type.equalsIgnoreCase("s")) {
                    count = count + 1;
                } else {
                    count = count - 1;
                }
                if (count > 1) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            List<List<Integer>> intervalList = List.of(List.of(0, 30), List.of(5, 10), List.of(15, 20));
            ;
            System.out.println(checkIntervals(intervalList));
        }
    }

    //Arrange the characters of a string from lowercase , uppercase, digits
    class Solutions {
        public static void sort(String str) {
            char[] chars = str.toCharArray();

            String lowerChars = "";
            String upperChars = "";
            String digtis = "";
            for (int i = 0; i < chars.length; i++) {
                // if (Character.isLowerCase(chars[i])) {
                if (chars[i] >= 'a' && chars[i] <= 'z') {
                    lowerChars = lowerChars + chars[i];
                }
                // if (Character.isUpperCase(chars[i])) {
                if (chars[i] >= 'A' && chars[i] <= 'Z') {
                    upperChars = upperChars + chars[i];
                }
                // if (Character.isDigit(chars[i])) {
                if (chars[i] >= '0' && chars[i] <= '9') {
                    digtis = digtis + chars[i];

                }
            }
            System.out.println(lowerChars + upperChars + digtis);
        }

        public static void main(String[] args) {
            String str = "adfsFSDFSAsfsdfAA89Edsf";
            sort(str);
        }
    }

    //    27. Remove Element
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }

    // 189. Rotate Array
//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            int last = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }

    // Understandable code
    public void rotate1(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            rotateBy1(nums);
        }
    }

    private void rotateBy1(int[] nums) {
        int length = nums.length;
        int last = nums[length - 1];
        for (int j = length - 1; j > 0; j--) {
            nums[j] = nums[j - 1];
        }
        nums[0] = last;
    }

    // Given a string s consisting of words and spaces, return the length of the last word in the string.
    public static int lengthOfLastWord(String s) {
        String[] word = s.split(" ");
        String lastWord = word[word.length - 1];
        return lastWord.length();
    }

    //create subArray
    public static void subarray(int[] nums) {
        for (int size = 1; size <= nums.length; size++) {
            for (int start = 0; start <= nums.length - size; start++) {
                System.out.print("[");
                for (int j = start; j < start + size; j++) {
                    System.out.print(nums[j]);
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }

    public static void main1(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        subarray(nums);
    }
}
 // optimise solution for subArray
 class Solution {
     public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Integer sum = nums[0];
        Integer wL = 0;
        Integer wR = 0;
        Integer minLength = Integer.MAX_VALUE;
        while (wR < nums.length && wL <= wR) {
            if (sum == target) {
                System.out.println("wR is" + wR + "wL is" + wL);
                minLength = Math.min(minLength, wR - wL + 1);
            }
            if (sum <= target && wR < nums.length - 1) {
                wR++;
                sum = sum + nums[wR];
                System.out.println("Inside wR is" + wR);
            }
            else {
                sum = sum - nums[wL];
                wL++;
                System.out.println("Inside wL is" + wL);
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }
}
// 112. Path Sum
// Given the root of a binary tree and an integer targetSum,
// return true if the tree has a root-to-leaf path such that adding
// up all the values along the path equals targetSum.
//A leaf is a node with no children.
public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
        return false;
    }
    if (isLeaf(root)) {
        return root.val == targetSum;
    }

    Boolean leftResult = hasPathSum(root.left, targetSum - root.val);
    Boolean rightResult = hasPathSum(root.right, targetSum - root.val);
    return leftResult || rightResult;
}

public boolean isLeaf(TreeNode root) {
    return root.left == null && root.right == null;
}

//104. Maximum Depth of Binary Tree
//Given the root of a binary tree, return its maximum depth.
//A binary tree's maximum depth is the number of nodes along the longest path from the root node down
// to the farthest leaf node.
public int maxDepth(TreeNode root) {
    if (root == null) return 0;

    int leftHeight = maxDepth(root.left);
    int rightHeight = maxDepth(root.right);

    return 1 + Math.max(leftHeight, rightHeight);
}

//111. Minimum Depth of Binary Tree
/* Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.*/
public int minDepth(TreeNode root) {
    if (root == null) return 0;

    if(root.left == null && root.right == null) return 1;
    int rightResult = Integer.MAX_VALUE;
    int leftResult = Integer.MAX_VALUE;

    if (root.left != null) {
        leftResult = 1 + minDepth(root.left);
    }

    if (root.right != null) {
        rightResult = 1 + minDepth(root.right);
    }

    return Math.min(leftResult, rightResult);
}
/* 100. Same Tree
* Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.*/

public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
        return true;
    }
    if (p == null || q == null || p.val != q.val) {
        return false;
    }
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}

        // 28. Find the Index of the First Occurrence in a String
/*Given two strings needle and haystack, return the index of
    the first occurrence of needle in haystack,
    or -1 if needle is not part of haystack.*/
        //  public static int strStr(String s) {

    //}


//125. Valid Palindrome
/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
    and removing all non-alphanumeric characters, it reads the same forward
    and backward. Alphanumeric characters include letters and numbers.*/

// public static boolean isPalindrome(String s) {

