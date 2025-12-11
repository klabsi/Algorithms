package org.sawaklaudia.christmas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SecretSantaTest {

    private SecretSanta secretSanta;

    @BeforeEach
    void setUp() {
        secretSanta = new SecretSanta();
    }

    @Test
    void testDrawWithShuffle_noSelfChosen() {
        // given
            List<String> people = List.of("A", "B", "C", "D");

        // when
        Map<String, String> result = secretSanta.drawWithShuffle(people);

        // then
        for(String person : people) {
            assertNotEquals(person, result.get(person), "Person shouldn't draw themselves");
        }
    }
}