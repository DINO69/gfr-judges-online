package br.com.guifr.hackerrank.preparationkit.threemonth.weekseven;

import java.util.*;

public class ClimbingLeaderboard {

    private static List<Integer> podium;

    public static List<Integer> withBinarySearch(List<Integer> r, List<Integer> p){
        List<Integer> res = new ArrayList<>();
        Set<Integer> ranksSet = new HashSet<>(r);
        List<Integer> temp = new ArrayList<>(ranksSet);
        temp.sort(Comparator.reverseOrder());
        for (int playerScore : p) {
            res.add(manipulateIndexWithBinarySearch(temp, playerScore));
        }
        return res;
    }

    private static int manipulateIndexWithBinarySearch(List<Integer> temp, int playerScore) {
        int index = Collections.binarySearch(temp, playerScore, Comparator.reverseOrder());
        index = (index < 0) ? Math.abs(index) : index+1;
        return index;
    }

    public static List<Integer> with(List<Integer> r, List<Integer> p) {
        List<Integer> resultNewPlayers = new LinkedList<>();
        createPodium(r);

        for(Integer scoreNewPlayer : p){
            //addScoreInPodium(scoreNewPlayer);
            resultNewPlayers.add(getPositionThatScore(scoreNewPlayer));
        }

        return resultNewPlayers;
    }

    private static int getPositionThatScore(Integer scoreNewPlayer) {
        //return podium.indexOf(scoreNewPlayer) + 1;
        return manipulateIndexWithBinarySearch(podium, scoreNewPlayer);
    }

    private static void createPodium(List<Integer> r) {
        podium = new ArrayList<>(new HashSet<>(r));
        Collections.sort(podium,Collections.reverseOrder());
    }

    private static void addScoreInPodium(int score) {
        if(!podium.contains(score)){
            podium.add(score);
            Collections.sort(podium,Collections.reverseOrder());
        }
    }

}
