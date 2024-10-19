package br.com.guifr;

import java.util.List;

public class PossiblesPathToGo {

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

        //go to below
        for(int x = initialX + 1; x < board.size();x++){
            if(board.get(x).get(initialY) == 0) result++;
            else break;
        }

        //go to above
        for(int x = initialX  - 1; x >= 0; x--){
            if(board.get(x).get(initialY) == 0) result++;
            else break;
        }

        //go to left
        for(int y = initialY - 1; y >= 0;y--){
            if(board.get(initialX).get(y) == 0) result++;
            else break;
        }

        //go to right
        for(int y = initialY + 1; y < board.get(initialX).size() ;y++){
            if(board.get(initialX).get(y) == 0) result++;
            else break;
        }

        //go to above + left
        for(int x = initialX - 1, y = initialY - 1; x >= 0 && y >= 0 ;x--,y--){
            if(board.get(x).get(y) == 0) result++;
            else break;
        }

        //go to above + right
        for(int x = initialX - 1, y = initialY + 1; x >= 0 && y < board.get(x).size() ;x--,y++){
            if(board.get(x).get(y) == 0) result++;
            else break;
        }

        //go to below + left
        for(int x = initialX + 1, y = initialY - 1; x < board.size() && y >= 0 ;x++,y--){
            if(board.get(x).get(y) == 0) result++;
            else break;
        }

        //go to below + right
        for(int x = initialX + 1, y = initialY + 1; x < board.size() && y < board.get(x).size() ;x++,y++){
            if(board.get(x).get(y) == 0) result++;
            else break;
        }

        return result;
    }


}