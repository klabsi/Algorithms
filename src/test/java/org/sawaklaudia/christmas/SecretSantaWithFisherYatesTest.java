package org.sawaklaudia.christmas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SecretSantaWithFisherYatesTest {

    private SecretSantaWithFisherYates secretSantaWithFisherYates;

    @BeforeEach
    void setUp() {
        secretSantaWithFisherYates = new SecretSantaWithFisherYates();
    }

    @Test
    void shouldNotAssignPersonToThemself() {
        // given
        List<String> people = List.of("A", "B", "C", "D");

        // when
        Map<String, String> result = secretSantaWithFisherYates.draw(people);

        // then
        for(Map.Entry<String, String> entry : result.entrySet()) {
            assertNotEquals(entry.getKey(), entry.getValue(), entry.getKey() + " draw themself");
        }
    }
}