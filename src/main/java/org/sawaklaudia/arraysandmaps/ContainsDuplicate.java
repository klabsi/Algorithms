package org.sawaklaudia.arraysandmaps;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsSet.contains(nums[i])) {
                return true;
            }
            numsSet.add(nums[i]);
        }
        return false;
    }
}

 /* O(1) - contain() and add()
    O(n) - for loop
    O(1) * O(n) -> O(n)
 */