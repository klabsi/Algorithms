package org.sawaklaudia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {

    private ValidAnagram validAnagram;

    @BeforeEach
    void setUp() {
        validAnagram = new ValidAnagram();
    }

    @Test
    void shouldReturnFalse(){
        // given
        String s = "a";
        String t = "b";

        // when
        boolean actual = validAnagram.isAnagram(s, t);

        // then
        Assertions.assertFalse(actual);
    }

    @Test
    void shouldReturnTrue(){
        // given
        String s = "anagram";
        String t = "nagaram";

        // when
        boolean actual = validAnagram.isAnagram(s, t);

        // then
        Assertions.assertTrue(actual);
    }
}