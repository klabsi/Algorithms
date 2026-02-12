package org.sawaklaudia;

import java.util.*;

public class GroupAnagrams2 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i ++) {
            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String sortedLetters = new String(letters);
            map.computeIfAbsent(sortedLetters, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
