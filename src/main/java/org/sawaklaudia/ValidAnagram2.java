package org.sawaklaudia;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram2 {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> counterMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            counterMap.put(ch, counterMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            if (!counterMap.containsKey(ch)) {
                return false;
            } else {
                counterMap.put(ch, counterMap.get(ch) - 1);
            }
        }

        for (Integer count : counterMap.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
        String s2 = "rat", t2 = "car";
        System.out.println(isAnagram(s2, t2));
    }
}
