package org.sawaklaudia.strings;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        if (s.isEmpty() || s.isBlank()) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            char left = s.charAt(start);
            char right = s.charAt(end);
            if (!Character.isLetterOrDigit(left)) {
                start++;
            } else if (!Character.isLetterOrDigit(right)) {
                end--;
            } else {
                if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}

/*
    Time complexity: O(n)  <- while loop, each character is processed at most once
    Space complexity: O(1) <- there are no additional data structures
 */
