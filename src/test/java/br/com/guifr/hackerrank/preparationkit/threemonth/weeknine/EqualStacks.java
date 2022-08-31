package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import java.util.*;

public class EqualStacks {

    public static int equalStacks(List<Integer>... stacksInList) {
        Deque<Integer>[] stacks = toStack(stacksInList);

        int[] maxs = sumValuesIn(stacks);

        Set<Integer> sums = toSet(maxs);
        while(sums.size() != 1){
            int indexMax = whatIndexMaxNumber(maxs);
            maxs[indexMax] -= stacks[indexMax].pop();
            sums = toSet(maxs);
        }

        return sums.stream().findFirst().get();
    }

    private static int[] sumValuesIn(Deque<Integer>[] stacks) {
        int[] maxs = new int[stacks.length];
        for(int i = 0; i < stacks.length; i++){
            maxs[i] = sum(stacks[i]);
        }
        return maxs;
    }

    private static Deque<Integer>[] toStack(List<Integer>[] stacksInList) {
        Deque<Integer>[] stacks = new Deque[stacksInList.length];
        for(int i = 0; i < stacksInList.length; i++){
            stacks[i] = new ArrayDeque<>(stacksInList[i]);
        }
        return stacks;
    }

    private static Set<Integer> toSet(int[] maxs) {
        Set<Integer> sums = new HashSet<>();
        for(int max : maxs){
            sums.add(max);
        }
        return sums;
    }

    private static int whatIndexMaxNumber(int[] maxs) {
        int max = 0;
        int maxIndex = -1;
        for(int i = 0 ; i < maxs.length ; i++){
            if(maxs[i] > max){
                max = maxs[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int sum(Deque<Integer> stack) {
        int sum = 0;
        for(int element : stack){
            sum += element;
        }
        return sum;
    }

    public static Deque<Integer> stackWithMaxSum(Deque<Integer>... stacks) {

        int max = 0;
        Deque<Integer> result = null;
        for(Deque<Integer> stack : stacks){
            int sum = sum(stack);
            if(sum > max){
                result = stack;
                max = sum;
            }
        }

        return result;
    }
}
