package br.com.guifr;

import java.util.List;

public class PossiblesPathToGoAfterRefactoryCopy {

    public static final int INVALID_POSITION = -1;
    public static final int FREE_POSITION = 0;

    /**
     * board[][] == 0 We can go to this place </br>
     * board[][] != 0 We can't go to this place neither other after </br>
     *
     * @param board the board to find possbiles place to go
     * @param initialX the board[x] position that indicate where the mainly piece is being initialized
     * @param initialY the board[x][y] position that indicate where the mainly piece is being initialized
     *
    * */
    public static int countEmptyPlaceToGo(List<List<Integer>> board, int initialX, int initialY){

        int result = 0;

        Pair toUp = new Pair(initialX,initialY,-1,0);
        Pair toDown = new Pair(initialX,initialY,+1,0);
        Pair toLeft = new Pair(initialX,initialY,+1,0);
        Pair toRight = new Pair(initialX,initialY,0,-1);

        Pair toUpLeft = new Pair(initialX,initialY,-1,-1);
        Pair toUpRight = new Pair(initialX,initialY,-1,+1);
        Pair toDownLeft = new Pair(initialX,initialY,+1,-1);
        Pair toDownRight = new Pair(initialX,initialY,+1,+1);

        List<Pair> pairs = List.of(toUp,toDown,toLeft,toRight,toUpLeft,toUpRight,toDownLeft,toDownRight);


        while(!pairs.isEmpty()) {

            tryNextXY(board,toUp, -1,0);
            if (validPlace(board, toUp) && freePlace(board, toUp)) result++;

            tryNextXY(board,toDown, +1,0);
            if (validPlace(board, toDown) && freePlace(board, toDown)) result++;

            tryNextXY(board,toLeft, 0,-1);
            if (validPlace(board, toLeft) && freePlace(board, toLeft)) result++;

            tryNextXY(board,toRight, 0,+1);
            if (validPlace(board, toRight) && freePlace(board, toRight)) result++;

            tryNextXY(board,toUpLeft, -1,-1);
            if (validPlace(board, toUpLeft) && freePlace(board, toUpLeft)) result++;

            tryNextXY(board,toUpRight, -1,+1);
            if (validPlace(board, toUpRight) && freePlace(board, toUpRight)) result++;

            tryNextXY(board,toDownLeft, +1,-1);
            if (validPlace(board, toDownLeft) && freePlace(board, toDownLeft)) result++;

            tryNextXY(board,toDownRight, +1, +1);
            if (validPlace(board, toDownRight) && freePlace(board, toDownRight)) result++;

        }

        return result;
    }

    private static int tryNextXAbove(List<List<Integer>> board, int x, int y) {
        return tryNextX(board,x,y,-1);
    }

    private static int tryNextX(List<List<Integer>> board, int x, int y) {
        return tryNextX(board,x,y,+1);
    }

    private static int tryNextYMinus(List<List<Integer>> board, int x, int y) {
        return tryNextY(board,x,y,-1);
    }

    private static int tryNextYPlus(List<List<Integer>> board, int x, int y) {
        return tryNextY(board,x,y,+1);
    }

    private static void tryNextX(List<List<Integer>> board, Pair xy, int delta) {
        int newX = tryNextX(board, xy.x, xy.y, delta);
        xy.x = newX;
    }

    private static void tryNextY(List<List<Integer>> board, Pair xy,int delta) {
        int newY = tryNextY(board, xy.x, xy.y, delta);
        xy.y = newY;
    }

    private static int tryNextX(List<List<Integer>> board, int x, int y, int delta) {
        if(!validPlace(board,x,y)) return INVALID_POSITION;
        x += delta;
        if(validPlace(board,x,y) && freePlace(board,x,y)) return x;
        return INVALID_POSITION;
    }

    private static void tryNextXY(List<List<Integer>> board, Pair xy, int deltaX, int deltaY) {
        xy.x += deltaX;
        xy.y += deltaY;
        if(!validPlace(board,xy)){
            xy.x = INVALID_POSITION;
            xy.y = INVALID_POSITION;
        }
    }

    private static void tryNextXY(List<List<Integer>> board, Pair xy) {
        xy.x += xy.deltaX;
        xy.y += xy.deltaY;
        if(!validPlace(board,xy)){
            xy.x = INVALID_POSITION;
            xy.y = INVALID_POSITION;
        }
    }

    private static int tryNextY(List<List<Integer>> board, int x, int y, int delta) {
        if(!validPlace(board,x,y)) return INVALID_POSITION;
        y += delta;
        if(validPlace(board,x,y) && freePlace(board,x,y)) return y;
        return INVALID_POSITION;
    }

    private static boolean freePlace(List<List<Integer>> board, int x, int y) {
        return board.get(x).get(y) == FREE_POSITION;
    }

    private static boolean validPlace(List<List<Integer>> board, int x, int y) {
        if(x < 0 || x >= board.size()) return false;
        if(y < 0 || y >= board.get(x).size()) return false;
        return true;
    }

    private static boolean validPlace(List<List<Integer>> board, Pair xy) {
        if(xy.x < 0 || xy.x >= board.size()) return false;
        if(xy.y < 0 || xy.y >= board.get(xy.x).size()) return false;
        return true;
    }

    private static boolean freePlace(List<List<Integer>> board, Pair xy) {
        return board.get(xy.x).get(xy.y) == FREE_POSITION;
    }


    private static class Pair {
        public Pair(int x, int y, int deltaX, int deltaY) {
            this.x = x;
            this.y = y;
            this.deltaX = deltaX;
            this.deltaY = deltaY;
        }

        int x;
        int y;
        int deltaX;
        int deltaY;

    }
}
