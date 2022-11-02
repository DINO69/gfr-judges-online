package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.PriorityQueue;

public class JesseAndCookies {
    public static int combined(List<Integer> cookies, int k) {

        PriorityQueue<Integer> inOrder = new PriorityQueue<>(cookies);

        int times = 0;

        while(inOrder.size() >= 2 && !isAllSweetsGreaterOrEqThanK(k, inOrder)) {
            times++;
            inOrder.add(combining(inOrder));
        }

        return isAllSweetsGreaterOrEqThanK(k, inOrder) ? times : -1;
    }

    private static boolean isAllSweetsGreaterOrEqThanK(int k, PriorityQueue<Integer> inOrder) {
        return !inOrder.isEmpty() && inOrder.peek() >= k;
    }


    private static int combining(@NotNull PriorityQueue<Integer> inOrder) {
        if(inOrder.size() < 2) return -1;
        int leastSweet = inOrder.poll();
        int secondLeastSweet = inOrder.poll();
        return leastSweet + (2 * secondLeastSweet);
    }
}
