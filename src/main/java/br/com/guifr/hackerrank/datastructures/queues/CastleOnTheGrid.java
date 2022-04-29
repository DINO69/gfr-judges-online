package br.com.guifr.hackerrank.datastructures.queues;

import java.util.*;

public class CastleOnTheGrid {

    public static boolean isValid(PositionGrid p, List<List<String>> grid) {
        if(p.x >= grid.size() || p.x < 0 || p.y >= grid.size() || p.y < 0){
            return false;
        }
        if(grid.get(p.x).get(p.y).equalsIgnoreCase("X")){
            return false;
        }
        return true;
    }

    protected static class PositionGrid{
        int x;
        int y;
        int steps;

        public PositionGrid(int x, int y, int steps) {
            this.x = x;
            this.y = y;
            this.steps = steps;
        }
    }


    /**
     * minimum moves
     * <p>
     * grid example ["...",".X.","..."]
     * <p>
     *  y = 0 1 2
     * <p>
     *  x = 0 . . .
     * <p>
     * x = 1 . X .
     * <p>
     * x = 2 . . .
     *
     * @param grid grid
     * @param startX startX
     * @param startY startY
     * @param goalX goalX
     * @param goalY goalY
     * @return {@link int}
     */
    public static int minimumMovesIn(List<String> grid, int startX, int startY, int goalX, int goalY) {

        List<List<String>> gridbuilt = build(grid);

        Queue<PositionGrid> queueFind = new ArrayDeque<>();
        int minimumMoves = 0;
        queueFind.add(new PositionGrid(startX,startY,minimumMoves));

        while(!queueFind.isEmpty()){
            PositionGrid stayHere = queueFind.poll();
            if(!isValid(stayHere,gridbuilt)){
                continue;
            }

            if(stayHere.x == goalX && stayHere.y == goalY){
                minimumMoves = stayHere.steps;
                break;
            }

            for (int goXUp = stayHere.x+1, goXDown= stayHere.x-1; goXDown >= 0 || goXUp < grid.size();goXUp++,goXDown--){
                PositionGrid go = new PositionGrid(goXUp, stayHere.y, stayHere.steps + 1);
                if(!isValid(go,gridbuilt)){
                    goXUp = gridbuilt.size() + 1;
                }else{
                    queueFind.add(go);
                }
                go = new PositionGrid(goXDown,stayHere.y,stayHere.steps + 1);
                if(!isValid(go,gridbuilt)){
                    goXDown = -1;
                }else{
                    queueFind.add(go);
                }
            }

            for (int goYUp = stayHere.y+1, goYDown= stayHere.y-1; goYDown >= 0 || goYUp < grid.size();goYUp++,goYDown--){
                PositionGrid go = new PositionGrid(stayHere.x,goYUp,stayHere.steps + 1);
                if(!isValid(go,gridbuilt)){
                    goYUp = gridbuilt.size() + 1;
                }else{
                    queueFind.add(go);
                }
                go = new PositionGrid(stayHere.x,goYDown,stayHere.steps + 1);
                if(!isValid(go,gridbuilt)){
                    goYDown = -1;
                }else{
                    queueFind.add(go);
                }
            }

            gridbuilt.get(stayHere.x).set(stayHere.y,"X");
        }

        return minimumMoves;
    }

    public static List<List<String>> build(List<String> grid) {

        List<List<String>> result = new ArrayList<>();

        for(String x : grid){
            result.add(new ArrayList<>(Arrays.asList(x.split(""))));
        }

        return result;
    }
}
