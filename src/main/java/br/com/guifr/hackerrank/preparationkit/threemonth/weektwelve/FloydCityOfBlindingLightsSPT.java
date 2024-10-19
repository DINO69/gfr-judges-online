package br.com.guifr.hackerrank.preparationkit.threemonth.weektwelve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class FloydCityOfBlindingLightsSPT {

    public static final int INF = 99999999;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] roadNodesEdges = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int roadNodes = Integer.parseInt(roadNodesEdges[0]);
        int roadEdges = Integer.parseInt(roadNodesEdges[1]);

        List<Integer> roadFrom = new ArrayList<>();
        List<Integer> roadTo = new ArrayList<>();
        List<Integer> roadWeight = new ArrayList<>();

        IntStream.range(0, roadEdges).forEach(i -> {
            try {
                String[] roadFromToWeight = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                roadFrom.add(Integer.parseInt(roadFromToWeight[0]));
                roadTo.add(Integer.parseInt(roadFromToWeight[1]));
                roadWeight.add(Integer.parseInt(roadFromToWeight[2]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        int[][] canArrive = new int[roadNodes + 1][roadNodes + 1];
        initialize(canArrive);
        fillBetterWay(roadFrom, roadTo, roadWeight, canArrive);
        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int x = Integer.parseInt(firstMultipleInput[0]);

                int y = Integer.parseInt(firstMultipleInput[1]);

                //int result = findBetterWay(x,y,roadFrom,roadTo,roadWeight, new HashSet());
                //int result2 = findBetterWay2(x,y,roadFrom,roadTo,roadWeight, canArrive);
                int result2 = canArrive[x][y];

                //System.out.printf("%d - %d = %d\n",x,y,result == INF ? -1 : result);
                System.out.printf("[2]%d - %d = %d\n",x,y,result2 == INF ? -1 : result2);
                //System.out.printf("%d - %d = %d\n",x,y,result == INF ? -1 : result);
                //System.out.printf("%d\n",result == INF ? -1 : result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    public static void initialize(int[][] canArrive){
        for(int i = 0;i< canArrive.length ; i++){
            for(int j = 0;j< canArrive[i].length ; j++){
                int value = i == j ? 0 : INF;
                canArrive[i][j] = value;
            }
        }
    };

//    public static int findBetterWay2(int x,int y, List<Integer> roadFrom, List<Integer>roadTo,List<Integer> roadWeight,  int[][] canArrive){
//        return canArrive[x][y];
//    }

    private static void fillBetterWay(List<Integer> roadFrom, List<Integer> roadTo, List<Integer> roadWeight, int[][] canArrive) {

        for(int i = 0; i < roadFrom.size(); i++){
            canArrive[roadFrom.get(i)][roadTo.get(i)] =
                    Math.min(canArrive[roadFrom.get(i)][roadTo.get(i)], roadWeight.get(i));
        }

        int V = canArrive.length;
        int[][] original = Arrays.copyOf(canArrive,canArrive.length);
        for (int k = 1; k < V; k++) {
            int[] ints = bestWay(k, original,new HashSet<Integer>());
            canArrive[k] = Arrays.copyOf(ints,canArrive[k].length);
        }
        print(canArrive);
        print(original);



//        for (int k = 1; k < V; k++) {
//            // Pick all vertices as source one by one
//            for (int i = 1; i < V; i++) {
//                // Pick all vertices as destination for the
//                // above picked source
//                for (int j = 1; j < V; j++) {
//                    // If vertex k is on the shortest path
//                    // from i to j, then update the value of
//                    // dist[i][j]
//                    if (canArrive[i][k] + canArrive[k][j] < canArrive[i][j])
//                        canArrive[i][j] = canArrive[i][k] + canArrive[k][j];
//                }
//            }
//        }


        //print(canArrive);

    }

    private static int[] bestWay(int k, int[][] canArrive, HashSet<Integer> sptSet) {
        sptSet.add(k);
        int V = canArrive[k].length;
        int dist[] = Arrays.copyOf(canArrive[k],canArrive[k].length);
        /*for (int i = 0; i < V; i++) {
            dist[i] = INF;
        }*/
        dist[k] = 0;
        // Find shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
            // Pick the minimum distance vertex from the set
            // of vertices not yet processed. u is always
            // equal to src in first iteration.
            int u = minDistance(dist, sptSet);

            // Mark the picked vertex as processed
            sptSet.add(u);

            // Update dist value of the adjacent vertices of
            // the picked vertex.
            for (int v = 0; v < V; v++)

                // Update dist[v] only if is not in sptSet,
                // there is an edge from u to v, and total
                // weight of path from src to v through u is
                // smaller than current value of dist[v]
                if (!sptSet.contains(v) && canArrive[u][v] != 0
                        && dist[u] != INF
                        && dist[u] + canArrive[u][v] < dist[v])
                    dist[v] = dist[u] + canArrive[u][v];
        }

        return dist;
    }

    private static int minDistance(int[] dist, HashSet<Integer> sptSet) {
        int min = INF, min_index = -1;
        int V = dist.length;
        for (int v = 0; v < V; v++)
            if (!sptSet.contains(v) && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        return min_index;
    }

    private static void print(int[][] canArrive) {
        for(int i = 0; i< canArrive.length; i++){
            for(int j = 0; j< canArrive.length; j++) {
                if (canArrive[i][j] != INF)
                    System.out.printf("%d-%d=%d\n",i,j,canArrive[i][j]);
            }
        }
    }

    public static void allThatCanArriveIn(int from,int to,int weight,int[][] canArrive){

        iWill(from,to,canArrive);

        comeToMe(from,to,canArrive);

        /*for(int i = 0; i< canArrive.length; i++){
            int iWill = canArrive[from][i];
            if(iWill != INF && canArrive[from][to] > canArrive[i][to]){
                canArrive[from][to] = Math.min(canArrive[from][to],canArrive[from][i] + canArrive[i][to]);
            }
        }

        for(int i = 0; i< canArrive.length; i++){
            int weightOfFrom = canArrive[i][from];
            int weightOfTo = canArrive[i][to];
            if(weightOfFrom != INF){
                int newWeight = weightOfFrom + weight;
                if(newWeight < weightOfTo) {
                    allThatCanArriveIn(i,to,newWeight,canArrive);
                    canArrive[i][to] = Math.min(weightOfTo, newWeight);
                }
            }
        }*/

    }

    private static void comeToMe(int from, int to, int[][] canArrive) {
        int myWeight = canArrive[from][to];
        for(int i = 0; i< canArrive.length; i++){
            if(i == from) continue;
            if(canArrive[i][from] != INF && canArrive[i][from] < canArrive[i][to]){
                canArrive[i][to] = Math.min(canArrive[i][to], canArrive[i][from] + myWeight);
                comeToMe(i,to,canArrive);
            }
        }
    }

    private static void iWill(int from, int to, int[][] canArrive) {
        int myWeight = canArrive[from][to];
        for(int i = 0; i< canArrive.length; i++){
            if(i == to) continue;
            if(canArrive[to][i] != INF && canArrive[to][i] < canArrive[from][i]){
                canArrive[from][i] = Math.min(canArrive[from][i], myWeight + canArrive[to][i]);
                iWill(from,i,canArrive);
            }
        }
    }


    public static int findBetterWay(int x,int y, List<Integer> roadFrom, List<Integer>roadTo,List<Integer> roadWeight, Set<Integer> alreadyVisit){
        if(x == y) return 0;

        alreadyVisit.add(x);

        int resultMin = INF;

        for(int i = 0; i < roadFrom.size();i++){
            if(roadFrom.get(i) == x && !alreadyVisit.contains(roadTo.get(i))){
                int tryOtherOption = findBetterWay(roadTo.get(i),y,roadFrom,roadTo,roadWeight,new HashSet(alreadyVisit));
                if(tryOtherOption == INF) continue;
                resultMin = Math.min(resultMin, tryOtherOption + roadWeight.get(i));
            }
        }

        //return resultMin == INF ? 0 : resultMin;
        return resultMin;

    }

}
