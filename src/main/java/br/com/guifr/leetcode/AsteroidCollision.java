package br.com.guifr.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> right = new Stack<>();
        Stack<Integer> left = new Stack<>();
        Queue<Integer> withOutCollision = new ArrayDeque<>();


        for (int i = 0; i < asteroids.length; i++) {
            int asteroid = asteroids[i];
            if (bothIsEmpty(right, left)) {
                if (asteroid < 0) {
                    withOutCollision.add(asteroid);
                    continue;
                }
                if (asteroid > 0 && dontHaveAsteroidsNegatives(asteroids, i)) {
                    withOutCollision.add(asteroid);
                    continue;
                }
            }
            if (asteroid > 0) {
                right.push(asteroid);
            }
            if (asteroid < 0) {
                left.push(asteroid);
            }
            while (bothHasElement(right, left)) {
                processCollision(right, left);
            }
            while (hasElement(left) && !hasElement(right)) {
                withOutCollision.add(left.pop());
            }
        }
        Stack<Integer> stackForBuildResult = whichStackHasValueForBuildResult(right, left);
        return buildresult(withOutCollision, stackForBuildResult);
    }

    private static void processCollision(Stack<Integer> right, Stack<Integer> left) {
        int rightAsteroid = right.peek();
        int leftAsteroid = Math.abs(left.peek());
        if (rightAsteroid < leftAsteroid) {
            right.pop();
        }else if (rightAsteroid > leftAsteroid) {
            left.pop();
        }else if (rightAsteroid == leftAsteroid) {
            right.pop();
            left.pop();
        }
    }

    private static Stack<Integer> whichStackHasValueForBuildResult(Stack<Integer> right, Stack<Integer> left) {
        Stack<Integer> stackForBuildResult = new Stack<>();
        if (hasElement(right)) {
            stackForBuildResult = right;
        }
        if (hasElement(left)) {
            stackForBuildResult = left;
        }
        return stackForBuildResult;
    }

    private boolean bothIsEmpty(Stack<Integer> right, Stack<Integer> left) {
        return right.isEmpty() && left.isEmpty();
    }

    private boolean bothHasElement(Stack<Integer> right, Stack<Integer> left) {
        return hasElement(right) && hasElement(left);
    }

    private boolean dontHaveAsteroidsNegatives(int[] asteroids, int i) {
        while (i < asteroids.length) {
            if (asteroids[i] < 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static int[] buildresult(Queue<Integer> withOutCollision, Stack<Integer> asteroids) {
        int[] result = new int[withOutCollision.size() + asteroids.size()];
        int i = result.length - 1;
        while (hasElement(asteroids)) {
            result[i] = asteroids.pop();
            i--;
        }
        i = 0;
        while (!withOutCollision.isEmpty()) {
            result[i] = withOutCollision.poll();
            i++;
        }

        return result;
    }

    private static boolean hasElement(Stack<Integer> right) {
        return !right.isEmpty();
    }

}
