package br.com.guifr.hackerrank.datastructures.queues;

import java.util.*;
import java.util.stream.Collectors;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity =  Integer.valueOf(sc.nextLine());

        List<String> queries = new ArrayList<>();

        while(quantity-- > 0){
            queries.add(sc.nextLine());
        }

        System.out.print(stringForPrint(of(queries)));

    }


    public static List<Integer> of(List<String> queries) {

        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        for (String query : queries) {

            switch (query.charAt(0)) {
                case '1':
                    enqueue(queue, Integer.valueOf(query.substring(2)));
                    break;
                case '2':
                    dequeue(queue);
                    break;
                case '3':
                    result.add(head(queue));
                    break;
            }

        }

        return result;
    }

    public static void enqueue(Queue<Integer> queue, int n) {
        queue.add(n);
    }

    public static int dequeue(Queue<Integer> queue) {
        return queue.poll();
    }

    public static int head(Queue<Integer> queue) {
        return queue.peek();
    }

    public static String stringForPrint(List<Integer> a) {
        return a.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("\n"));
    }

    public static String stringForPrintWithoutStream(List<Integer> asList) {
        List<String> numberAsString = asList.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        return String.join("\n", numberAsString);
    }
}
