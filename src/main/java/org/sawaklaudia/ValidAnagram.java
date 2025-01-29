package org.sawaklaudia;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0)+ 1);
        }

        Map<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (!mapS.containsKey(t.charAt(i))) {
                return false;
            } else {
                mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0)+ 1);
            }
        }
        System.out.println("S HashMap: " + mapS);
        System.out.println("T HashMap: " + mapT);
        return mapS.equals(mapT);
    }
}