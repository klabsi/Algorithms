package org.sawaklaudia;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
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

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target));

        nums = new int[]{1, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        target = 2;
        System.out.println(searchInsert(nums, target));

        nums = new int[]{1, 3, 5, 6};
        target = 7;
        System.out.println(searchInsert(nums, target));
    }
}
