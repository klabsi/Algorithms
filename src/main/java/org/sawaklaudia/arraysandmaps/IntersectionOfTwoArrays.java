package org.sawaklaudia.arraysandmaps;

import java.util.*;

public class IntersectionOfTwoArrays {

    // intersection - set of elements that are present in both arrays
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> integerSet = new HashSet<>();
        for (int num : nums1) {
            integerSet.add(num);
        }

        Set<Integer> intersections = new HashSet<>();
        for (int num : nums2) {
            if(integerSet.contains(num)) {
                intersections.add(num);
            }
        }

        return intersections.stream().mapToInt(Integer::intValue).toArray();
    }
}

 /*
    O(1) - set.add(), set.contains()
    O(n) - loop
    O(n) * O(1) = O(n)
  */
