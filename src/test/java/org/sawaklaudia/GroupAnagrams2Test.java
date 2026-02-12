package org.sawaklaudia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class GroupAnagrams2Test {

    private GroupAnagrams2 groupAnagrams2;

    @BeforeEach
    void setUp() {
        groupAnagrams2 = new GroupAnagrams2();
    }

    @Test
    void shouldReturnTrue() {
        // given
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = List.of(
                List.of("eat", "tea", "ate"),
                List.of("tan", "nat"),
                List.of("bat")
        );

        // when
        List<List<String>> actual = groupAnagrams2.groupAnagrams(strs);

        // then
        Assertions.assertEquals(
                sortArrays(expected),
                sortArrays(actual)
        );
    }

    private List<List<String>> sortArrays(List<List<String>> input) {
        return input.stream()
                .map(list -> {
                    List<String> sorted = new ArrayList<>(list);
                    Collections.sort(sorted);
                    return sorted;
                })
                .sorted(Comparator.comparing(Object::toString))
                .toList();
    }
}