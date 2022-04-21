package br.com.guifr.hackerrank;

import java.util.*;

public class MaximumElement {
    public static List<Integer> of(List<String> operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        List<Integer> result = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        boolean needSearch = true;

        for (String operation : operations) {
            String[] values = operation.split(" ");
            switch (Integer.valueOf(values[0])) {
                case 1: {
                    int value = Integer.valueOf(values[1]);
                    max = Math.max(value,max);
                    stack.push(value);
                    break;
                }
                case 2: {
                    int pop = stack.pop();
                    needSearch = true;
                    break;
                }
                case 3: {
                    if(needSearch) {
                        max = stack.stream().mapToInt(i -> i.intValue()).max().getAsInt();
                        needSearch = false;
                    }
                    result.add(max);
                    break;
                }
            }


        }

        return result;
    }
}
