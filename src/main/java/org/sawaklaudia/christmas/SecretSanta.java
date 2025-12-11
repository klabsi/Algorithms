package org.sawaklaudia.christmas;

import java.util.*;

public class SecretSanta {

    public Map<String, String> draw(List<String> people) { // doesn't handle the edge case that the last person doesn't draw themselves
        Map<String, String> map = new HashMap<>();
        List<String> toChoose = new ArrayList<>(people);

        for (int j = 0; j < people.size(); j++) {
            int drawn = new Random().nextInt(toChoose.size());
            while (toChoose.get(drawn).equals(people.get(j))) {
                drawn = new Random().nextInt(toChoose.size());
            }
            map.put(people.get(j), toChoose.get(drawn));
            toChoose.remove(drawn);
        }
        return map;
    }

    public Map<String, String> drawWithShuffle(List<String> people) {
        Map<String, String> map = new HashMap<>();
        List<String> toChoose = new ArrayList<>(people);

        boolean haveToShuffle = true;
        while(haveToShuffle) {
            Collections.shuffle(toChoose);
            boolean choseThemself = true;
            for (int i = 0; i < people.size() ; i++) {
                if (people.get(i).equals(toChoose.get(i))) {
                    choseThemself = true;
                    break;
                }
                choseThemself = false;
            }
            if(choseThemself == false) {
                haveToShuffle = false;
            }
        }
        for (int j = 0; j < people.size(); j++) {
            map.put(people.get(j), toChoose.get(j));
        }
        return map;
    }
}
