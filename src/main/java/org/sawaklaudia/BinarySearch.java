package org.sawaklaudia;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            if (nums[middleIndex] == target) {
                return middleIndex;
            } else if (nums[middleIndex] <= target) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }

        return -1;
    }

    public int searchWithForLoop(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[100_000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
        }
        Arrays.sort(nums);
        int target = 66;

        BinarySearch binarySearch = new BinarySearch();

        long before = System.nanoTime();
        binarySearch.searchWithForLoop(nums, target);
        long after = System.nanoTime();
        System.out.println("for " + (after - before));

        before = System.nanoTime();
        binarySearch.search(nums, target);
        after = System.nanoTime();
        System.out.println("binary " + (after - before));

    }
}
