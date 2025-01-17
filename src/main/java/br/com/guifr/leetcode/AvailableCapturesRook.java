package br.com.guifr.leetcode;


//https://leetcode.com/problems/available-captures-for-rook
public class AvailableCapturesRook {
    public int numRookCaptures(char[][] board) {
        int result = 0 ;

        for(int r = 0; r < board.length;r++){
            for(int c = 0; c < board[r].length;c++){
                if(board[r][c] == 'R'){
                    System.out.println(board[r][c]);
                    System.out.println(r);
                    System.out.println(c);
                    //go up
                    int auxC = c;
                    int auxR = r;
                    while(auxR-- > 0){
                        if(board[auxR][auxC] == 'p'){
                            result++;
                        }
                        if(board[auxR][auxC] != '.'){
                            break;
                        }
                    }
                    //go down
                    auxC = c;
                    auxR = r;
                    while(++auxR < board.length){
                        if(board[auxR][auxC] == 'p'){
                            result++;
                        }
                        if(board[auxR][auxC] != '.'){
                            break;
                        }
                    }

                    //go left
                    auxC = c;
                    auxR = r;
                    while(auxC-- > 0){
                        if(board[auxR][auxC] == 'p'){
                            result++;
                        }
                        if(board[auxR][auxC] != '.'){
                            break;
                        }
                    }

                    //go right
                    auxC = c;
                    auxR = r;
                    while(++auxC < board[auxR].length){
                        if(board[auxR][auxC] == 'p'){
                            result++;
                        }
                        if(board[auxR][auxC] != '.'){
                            break;
                        }
                    }

                    break;
                }
            }
        }

        return result;
    }

    public int numRookCapturesCopilot(char[][] board) {
        int result = 0;

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == 'R') {
                    result += countCaptures(board, r, c, -1, 0); // go up
                    result += countCaptures(board, r, c, 1, 0);  // go down
                    result += countCaptures(board, r, c, 0, -1); // go left
                    result += countCaptures(board, r, c, 0, 1);  // go right
                    return result;
                }
            }
        }

        return result;
    }

    private int countCaptures(char[][] board, int r, int c, int dr, int dc) {
        int captures = 0;
        int auxR = r + dr;
        int auxC = c + dc;

        while (auxR >= 0 && auxR < board.length && auxC >= 0 && auxC < board[auxR].length) {
            if (board[auxR][auxC] == 'p') {
                captures++;
                break;
            }
            if (board[auxR][auxC] != '.') {
                break;
            }
            auxR += dr;
            auxC += dc;
        }

        return captures;
    }
}
