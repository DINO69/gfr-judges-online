package br.com.guifr;

import java.util.List;

public class PossiblesPathToGoAfterRefactory {

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
        Pair toLeft = new Pair(initialX,initialY,0,-1);
        Pair toRight = new Pair(initialX,initialY,0,+1);

        Pair toUpLeft = new Pair(initialX,initialY,-1,-1);
        Pair toUpRight = new Pair(initialX,initialY,-1,+1);
        Pair toDownLeft = new Pair(initialX,initialY,+1,-1);
        Pair toDownRight = new Pair(initialX,initialY,+1,+1);

        List<Pair> pairs = List.of(toUp,toDown,toLeft,toRight,toUpLeft,toUpRight,toDownLeft,toDownRight);


        while(!pairs.isEmpty()) {

//            pairs.stream()
//                        .forEach(p -> tryNextXY(p));

            pairs = pairs.stream()
                    .map(p -> tryNextXY(p))
                    .filter( p -> validPlace(board,p))
                    .filter( p -> freePlace(board,p))
                    .toList();

            result += pairs.size();

        }

        return result;
    }

//    private static void tryNextXY(Pair xy) {
//        xy.x += xy.deltaX;
//        xy.y += xy.deltaY;
//    }
    private static Pair tryNextXY(Pair xy) {
        int newX = xy.x + xy.deltaX;
        int newY = xy.y + xy.deltaY;
        return new Pair(newX,newY, xy.deltaX, xy.deltaY);

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
