package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import java.util.*;
import java.util.stream.Collectors;

public class QHEAP1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = Integer.parseInt(sc.nextLine());

        List<List<Integer>> process = new ArrayList<>();

        List<Integer> result = new ArrayList<>();

        Queue<Integer> queue = new ArrayDeque<>();
        PriorityQueue<Integer> queueOrder = new PriorityQueue<>();

        while (times-- > 0){
            String value = sc.nextLine();
            String[] values = value.split(" ");
            List<Integer> options = Arrays.stream(values).map(Integer::parseInt).collect(Collectors.toList());
            process.add(options);

            Strategy strategy = whichStrategy(options);
            strategy.execute(queue);
            strategy.execute(queueOrder);

            if (options.get(0) == 3)
                result.add(strategy.execute(queueOrder));
        }

        System.out.println(buildResult(result));

    }

    public static Strategy whichStrategy(int option) {
        if (option == 1) return new AddStrategy(0);
        if (option == 2) return new RemoveStrategy(0);
        return new MinimumStrategy();
    }

    public static String process(List<List<Integer>> list) {

        List<Integer> result = new ArrayList<>();

        Queue<Integer> queue = new ArrayDeque<>();

        list.forEach(options -> {

            Strategy strategy = whichStrategy(options);
            int execute = strategy.execute(queue);
            if (options.get(0) == 3)
                result.add(execute);

        });

        return buildResult(result);
    }

    private static String buildResult(List<Integer> result) {
        return result.stream().map(String::valueOf).collect(Collectors.joining("\n"));
    }

    private static Strategy whichStrategy(List<Integer> options) {
        int option = options.get(0);
        if (option == 1) return new AddStrategy(options.get(1));
        if (option == 2) return new RemoveStrategy(options.get(1));
        return new MinimumStrategy();
    }

    public interface Strategy {
        int execute(Queue<Integer> queue);
    }

    protected static class AddStrategy implements Strategy {
        private int number;

        public AddStrategy(int number) {
            this.number = number;
        }

        @Override
        public int execute(Queue<Integer> queue) {
            queue.add(number);
            return number;
        }

    }

    protected static class RemoveStrategy implements Strategy {
        private final int number;

        public RemoveStrategy(int number) {
            this.number = number;
        }

        @Override
        public int execute(Queue<Integer> queue) {
            queue.remove(number);
            return number;
        }
    }

    protected static class MinimumStrategy implements Strategy {
        @Override
        public int execute(Queue<Integer> queue) {
            return queue.peek();
        }
    }
}
