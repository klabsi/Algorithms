package org.sawaklaudia;

public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        int actualSpeed = 0;
        int maxPile = 0;
        for(int i = 0; i < piles.length; i++) {
            if(piles[i] > maxPile){
                maxPile = piles[i];
            }
        }
        int left = 1;
        int right = maxPile;

        while (left <= right){
            int middle = (left + right) / 2;
            for(int i = 0; i < piles.length; i++) {
                actualSpeed += Math.ceil((double)piles[i] / (double)middle);
            }
            if(actualSpeed <= h) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
            actualSpeed = 0;
        }
        return left;
    }
}
