package br.com.guifr.beecrowd;

public class Queen {

    private int x1,x2,y1,y2;

    private int minimumSteps = Integer.MAX_VALUE;
    private boolean alreadySearchEndPosition = false;

    private int[][] chessBoard = new int[9][9];

    public Queen(int x, int y) {
        x1 = x;
        y1 = y;
        chessBoard[x][y] = 1;
    }

    public static Queen started(int x, int y) {
        return new Queen(x,y);
    }

    public Queen endedIn(int x, int y) {
        chessBoard[x][y] = 1;
        x2 = x;
        y2 = y;
        return this;
    }

    public int howMoves() {

        if(x1 == x2 && y1== y2){
            return 0;
        }


        return search(x1,y1,0);
    }

    protected int search(int xStarted, int yStarted, int stepsTaken) {
        stepsTaken++;

        chessBoard[xStarted][yStarted] = 2;

        Integer stepsTaken1 = xToRight(xStarted, yStarted, stepsTaken);
//        if (stepsTaken1 != null) return stepsTaken1;

        Integer stepsTaken2 = xToLeft(xStarted, yStarted, stepsTaken);
//        if (stepsTaken2 != null) return stepsTaken2;

        Integer stepsTaken3 = yToUp(xStarted, yStarted, stepsTaken);
//        if (stepsTaken3 != null) return stepsTaken3;

        Integer stepsTaken4 = yToDown(xStarted, yStarted, stepsTaken);
//        if (stepsTaken4 != null) return stepsTaken4;

        Integer stepsTaken5 = diagonalXToRightYUp(xStarted, yStarted, stepsTaken);
//        if (stepsTaken5 != null) return stepsTaken5;

        Integer stepsTaken6 = diagonalXToRightYDown(xStarted, yStarted, stepsTaken);
//        if (stepsTaken6 != null) return stepsTaken6;

        Integer stepsTaken7 = diagonalXToLeftYDown(xStarted, yStarted, stepsTaken);
//        if (stepsTaken7 != null) return stepsTaken7;

        Integer stepsTaken8 = diagonalXToLeftYUp(xStarted, yStarted, stepsTaken);
//        if (stepsTaken8 != null) return stepsTaken8;

        return minimumSteps;
    }

    private Integer diagonalXToLeftYUp(int xStarted, int yStarted, int stepsTaken) {
        if(alreadySearchEndPosition){
            return stepsTaken;
        }
        int y;
        y = yStarted + 1;
        for(int x = xStarted - 1; x >= 1; x--,y--){
            if(y == chessBoard.length){
                break;
            }
            if(searchEndPositionQueen(x,y,stepsTaken)){
                return stepsTaken;
            }
            if(canGoTo(x,y))
            search(x,y, stepsTaken);
        }
        return null;
    }

    private Integer diagonalXToLeftYDown(int xStarted, int yStarted, int stepsTaken) {
        if(alreadySearchEndPosition){
            return stepsTaken;
        }
        int y;
        y = yStarted - 1;
        for(int x = xStarted - 1; x >= 1; x--,y--){
            if(y == 0){
                break;
            }
            if(searchEndPositionQueen(x,y,stepsTaken)){
                return stepsTaken;
            }
            if(canGoTo(x,y))
            search(x,y, stepsTaken);
        }
        return null;
    }

    private Integer diagonalXToRightYDown(int xStarted, int yStarted, int stepsTaken) {
        if(alreadySearchEndPosition){
            return stepsTaken;
        }
        int y;
        y = yStarted - 1;
        for(int x = xStarted + 1; x < chessBoard.length; x++,y++){
            if(y == 0){
                break;
            }
            if(searchEndPositionQueen(x,y,stepsTaken)){
                return stepsTaken;
            }
            if(canGoTo(x,y))
            search(x,y, stepsTaken);
        }
        return null;
    }

    private Integer diagonalXToRightYUp(int xStarted, int yStarted, int stepsTaken) {
        if(alreadySearchEndPosition){
            return stepsTaken;
        }
        int y = yStarted + 1;
        for(int x = xStarted + 1; x < chessBoard.length; x++,y++){
            if(y == chessBoard.length){
                break;
            }
            if(searchEndPositionQueen(x,y,stepsTaken)){
                return stepsTaken;
            }
            if(canGoTo(x,y))
            search(x,y, stepsTaken);
        }
        return null;
    }

    private Integer yToDown(int xStarted, int yEnded, int stepsTaken) {
        if(alreadySearchEndPosition){
            return stepsTaken;
        }
        for(int y = yEnded - 1; y >= 1; y--){
            if(searchEndPositionQueen(xStarted,y,stepsTaken)){
                return stepsTaken;
            }
            if(canGoTo(xStarted,y))
            search(xStarted,y, stepsTaken);
        }
        return null;
    }

    private Integer yToUp(int xStarted, int yEnded, int stepsTaken) {
        if(alreadySearchEndPosition){
            return stepsTaken;
        }
        for(int y = yEnded + 1; y < chessBoard.length; y++){
            if(searchEndPositionQueen(xStarted,y,stepsTaken)){
                return stepsTaken;
            }
            if(canGoTo(xStarted,y))
            search(xStarted,y, stepsTaken);
        }
        return null;
    }

    private Integer xToLeft(int xStarted, int yStarted, int stepsTaken) {
        if(alreadySearchEndPosition){
            return stepsTaken;
        }
        for(int x = xStarted - 1; x >= 1; x--){
            if(searchEndPositionQueen(x,yStarted,stepsTaken)){
                return stepsTaken;
            }
            if(canGoTo(x,yStarted))
            search(x,yStarted, stepsTaken);
        }
        return null;
    }

    private Integer xToRight(int xStarted, int yStarted, int stepsTaken) {
        if(alreadySearchEndPosition){
            return stepsTaken;
        }
        for(int x = xStarted + 1; x < chessBoard.length; x++){
            if(searchEndPositionQueen(x,yStarted,stepsTaken)){
                return stepsTaken;
            }
            if(canGoTo(x,yStarted))
            search(x,yStarted, stepsTaken);
        }
        return null;
    }

    public boolean searchEndPositionQueen(int x, int y, int steps) {
        boolean aux = (x == x2 && y == y2);
        if(aux){
            alreadySearchEndPosition = aux;
            if (minimumSteps > steps){
                minimumSteps = steps;
            }
        }
        return alreadySearchEndPosition || aux;
    }

    public boolean canGoTo(int x, int y) {
        return chessBoard[x][y] == 0;
    }
}
