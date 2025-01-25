package org.sawaklaudia;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int leftIndex = 0;
        int rightindex = nums.length - 1;

        while (leftIndex <= rightindex) {
            int middleIndex = leftIndex + (rightindex - leftIndex) / 2;

            if (nums[middleIndex] == target) {
                return middleIndex;
            } else if (nums[middleIndex] < target) {
                leftIndex = middleIndex + 1;
            } else {
                rightindex = middleIndex - 1;
            }
        }

        return leftIndex;
    }
}
