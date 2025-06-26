package org.sawaklaudia.stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        int i = 0;
        int j = 1;
        while (j < asteroids.length) {
            if (asteroids[i] > 0 && asteroids[j] < 0) { // reduction
                int sum = asteroids[i] + asteroids[j];
                if (sum < 0) { // j wins
                    asteroids[i] = 0;
                } else if (sum > 0) { // i wins
                    asteroids[j] = 0;
                } else { // both collapse
                    asteroids[i] = 0;
                    asteroids[j] = 0;
                }

                if (!stack.empty()) {
                    i = stack.pop();
                } else {
                    i = j;
                    j++;
                }
            } else if (asteroids[j] == 0) {
                j++;
            } else {
                stack.push(i);
                i = j;
                j++;
            }
        }

        return removeZeros(asteroids);
    }

    private static int[] removeZeros(int[] asteroids) {
        return Arrays.stream(asteroids)
                .filter(num -> num != 0)
                .toArray();
    }

    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        int[] result = asteroidCollision(asteroids);
        System.out.println(Arrays.toString(result));
    }
}
