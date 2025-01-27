package org.sawaklaudia;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex <= rightIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;

            if (nums[middleIndex] == target) {
                return middleIndex;
            } else if (nums[middleIndex] < target) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }

        return leftIndex;
    }
}
