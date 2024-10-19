package br.com.guifr.hackerrank.preparationkit.threemonth.weektwelve;

import java.util.*;
import java.util.stream.Collectors;

public class MergingCommunities {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {



        String line = sc.nextLine();
        String[] values = line.split(" ");
        int n = Integer.parseInt(values[0]);
        int q = Integer.parseInt(values[1]);
        List<String> queries = new ArrayList<>();
        /*for (int i = 0; i < q; i++) {
            queries.add(sc.nextLine());
        }*/

        //System.out.println(MergingCommunities.process(n, q, queries));
        System.out.println(MergingCommunities.process(n, q));

    }

    private static String process(int n, int q) {
        MergingCommunities merging = new MergingCommunities(n);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            String query = sc.nextLine();
            if (isQ(query)) {
//                result.add(String.valueOf(merging.processQ(query)));
                System.out.println(merging.processQ(query));
            } else {
                merging.processM(query);
            }
        }
//        return result.stream().collect(Collectors.joining("\n"));
        return "";
    }

    public MergingCommunities(int persons) {
        connections = new HashMap<>();
        while (persons > 0) {
            connections.put(persons, new ArrayList<>(List.of(persons)));
            persons--;
        }
    }

    protected Map<Integer, List<Integer>> connections;

    public static String process(int n, int q, List<String> queries) {
        MergingCommunities merging = new MergingCommunities(n);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            String query = queries.get(i);
            if (isQ(query)) {
                result.add(String.valueOf(merging.processQ(query)));
            } else {
                merging.processM(query);
            }
        }

        return result.stream().collect(Collectors.joining("\n"));
    }

    private static boolean isQ(String query) {
        return query.charAt(0) == 'Q';
    }

    public int getConnections(int person) {
        HashSet<Integer> result = countConnections(person, new HashSet<>());
        return result.size();
    }

    private HashSet<Integer> countConnections(int person, Set<Integer> alreadyRead) {
        HashSet<Integer> result = new HashSet<>();
        result.addAll(connections.get(person));
        connections.get(person)
                .stream()
                .filter(p -> !alreadyRead.contains(p))
                .forEach(p -> {
                    alreadyRead.add(p);
                    result.addAll(countConnections(p, alreadyRead));
                });
        return result;
    }

    public int breakQ(String s) {
        return Integer.parseInt(s.substring(2));
    }

    public int getPersonInM(String s, int i) {
        String[] s1 = s.split(" ");
        return Integer.parseInt(s1[i]);
    }

    public int processQ(String s) {
        return getConnections(breakQ(s));
    }

    public void processM(String s) {
        int personI = getPersonInM(s, 1);
        int personJ = getPersonInM(s, 2);
        addConnections(personI, personJ);

    }

    private void addConnections(int personI, int personJ) {
        connections.get(personI).add(personJ);
        connections.get(personJ).add(personI);
    }
}
