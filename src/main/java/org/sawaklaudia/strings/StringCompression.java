package org.sawaklaudia.strings;

public class StringCompression {

    /*
    Input: chars = ["a","a","b","b","c","c","c"]
    Output: 6
    Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

    Input: chars = ["a","b","b","c","c","c"]
    ab2c3
     */
    public int compress(char[] chars) {
        int i = 0, j;
        int compressedLength = 0;

        while (i < chars.length) {
            j = i + 1;
            char current = chars[i];

            while(j < chars.length && chars[i] == chars[j]) {
                j++;
            }

            int count = j - i;

            chars[compressedLength++] = current; //writes `current` to the array at position `compressedLength`, then increments `write` by 1
            if (count > 1) {
                for( char ch : String.valueOf(count).toCharArray()) {
                    chars[compressedLength++] = ch;
                }
            }
            i = j;
        }

        return compressedLength;
    }
}
/*
    time complexity: O(n)
    space complexity: O(1) !
 */
