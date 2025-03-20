package org.sawaklaudia;

import java.util.*;

public class GroupAnagrams {

    //Input: strs = ["eat","tea","tan","ate","nat","bat"]
    //
    //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String sortedLetters = new String(letters);

            if (map.containsKey(sortedLetters)) {
                map.get(sortedLetters).add(word);
            } else {
                List<String> originalWords = new ArrayList<>();
                originalWords.add(word);
                map.put(sortedLetters, originalWords);
            }
        }
        return map.values().stream().toList();
    }
    // for - O(n)
    // sort = O(m(log(m)))
    // map O(1)
    // -> O(n*(m(log(m))))

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = groupAnagrams(strs);
        System.out.println(list);
    }
}
