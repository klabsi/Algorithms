package org.sawaklaudia.christmas;

import java.util.*;

public class SecretSantaWithFisherYates {

    public Map<String, String> draw(List<String> people) {
        List<String> chosen = new ArrayList<>(people);
        Random random = new Random();

        for (int i = chosen.size() - 1; i > 0 ; i--) {
            int j = random.nextInt(i + 1);

            if(j == i) {
                String temp = chosen.get(j);
                chosen.set(j, chosen.get(i - 1));
                chosen.set(i - 1, temp);
            } else {
                String temp = chosen.get(j);
                chosen.set(j, chosen.get(i));
                chosen.set(i, temp);
            }
        }

        Map<String, String> listOfPresentPairs = new HashMap<>();

        for (int i = 0; i < people.size(); i++) {
            listOfPresentPairs.put(people.get(i), chosen.get(i));
        }

        return listOfPresentPairs;
    }
}
