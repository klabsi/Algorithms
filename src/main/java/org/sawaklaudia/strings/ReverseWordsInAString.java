package org.sawaklaudia.strings;

public class ReverseWordsInAString {

    /*
    Input: "the sky is blue"
    Output: "blue is sky the"
     */
    public String reverseWords(String s) {
        String[] words = s.strip().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
/*
    O(n) - foor loop
    O(n) - StringBuilder
    (using String concatenation (+=) leads to O(n^2) as a Sting is immutable)
 */
