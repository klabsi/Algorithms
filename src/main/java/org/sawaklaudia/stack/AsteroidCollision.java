package org.sawaklaudia.stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        int i = 0;
        int j = 1;
        while(j < asteroids.length) {
            if (asteroids[i] > 0 && asteroids[j] < 0) { // reduction
                int sum = asteroids[i] + asteroids[j];
                if (sum < 0) { // j wins
                    asteroids[i] = 0;
                } else if(sum > 0) { // i wins
                    asteroids[j] = 0;
                } else { // both collapse
                    asteroids[i] = 0;
                    asteroids[j] = 0;
                }
                j++;
                if(stack.empty()){
                    i = j--;
                } else {
                    i = stack.pop();
                }
            } else {
                stack.push(asteroids[i]);
                i++;
                j++;
            }
        }
        return asteroids;
    }

    public static void main(String[] args) {
        int[] asteroids = {10, 2, -5};
        asteroidCollision(asteroids);
        System.out.println(Arrays.toString(asteroids));
    }

}
