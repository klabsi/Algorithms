package org.sawaklaudia;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int j = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            j = i + 1;
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
            }
        }
        return null;
    }

    public static int[] twoSumSolution2(int[] nums, int target) {
        int j;
        for(int i = 0; i <nums.length -1; i++) {
            j = i + 1;
            if (nums[j] == target - nums[i]) {
                return new int[]{i, j};
            }
        }
        return null;
    }

    public static int[] twoSumSolution3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSumSolution3(nums, target)));

        nums = new int[]{3, 2, 4};
        target = 6;

        System.out.println(Arrays.toString(twoSumSolution3(nums, target)));
    }
}
