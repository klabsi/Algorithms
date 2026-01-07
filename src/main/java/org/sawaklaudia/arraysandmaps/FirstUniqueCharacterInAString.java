package org.sawaklaudia.arraysandmaps;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        Map<Character, Integer> charAppearance = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            charAppearance.put(s.charAt(i),
                    charAppearance.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < s.length(); i++) {
            if(charAppearance.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}

 /*
    O(n) - for loop
    O(1) - put(), getOrDefault()
    O(n) * O(1) + O(n) -> O(2n) ~ O(n) (we ignore constants)
 */
