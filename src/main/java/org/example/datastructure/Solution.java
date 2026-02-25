package org.example.datastructure;

import java.util.Arrays;

public class Solution {
    public static void merge(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergedArray = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                mergedArray[k] = nums2[j];
                j++;
            }
            else {
                mergedArray[k] = nums1[i];
                i++;
            }
            k++;
        }
        if(i < nums1.length) {
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }
        else {
            while (j < nums2.length) {
                mergedArray[k] = nums2[j];
                j++;
                k++;
            }
        }

        System.out.print(Arrays.toString(mergedArray));

    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 70};
        int[] nums2 = {5, 6, 7};
        merge(nums1,nums2);
    }
}
