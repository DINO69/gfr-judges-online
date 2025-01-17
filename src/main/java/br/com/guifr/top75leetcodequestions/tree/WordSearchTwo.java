package br.com.guifr.top75leetcodequestions.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearchTwo {
    public List<String> findWords(char[][] board, String[] words) {

        List<String> result = new ArrayList<>();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){

                List<String> startWith = startWith(String.valueOf(board[i][j]), List.of(words));
                String prefix = String.valueOf(board[i][j]);

                if(startWith.isEmpty()) continue;

                //System.out.println(board[i][j]);
                //System.out.println(startWith);

                result.addAll(goSearch(i, j, board, prefix, startWith, new HashSet<Pair>(Set.of(new Pair(i,j)))));
            }
        }

        // think about the works with the same prefix

        result = result.stream().distinct().toList();

        return result;
    }

    public List<String> goSearch(int i, int j, char[][] board, String prefix, List<String> words, Set<Pair> alreadyVisit){

        List<String> result = new ArrayList<>();

        if(words.contains(prefix)) {
            result.add(prefix);
        }

        String newPrefix;
        int newI;
        int newJ;
        Pair visit;
        List<String> newWords;
        Set<Pair> newAlreadyVisit;

        //to go left
        newI = i;
        newJ = j - 1;
        visit = new Pair(newI,newJ);
        if(validPath(newI,newJ,board) && !alreadyVisit.contains(visit)){
            newPrefix = prefix + String.valueOf(board[newI][newJ]);
            newWords = startWith(prefix,words);
            newAlreadyVisit = new HashSet<Pair>(alreadyVisit);
            newAlreadyVisit.add(visit);
            if(!newWords.isEmpty()){
                result.addAll(goSearch(newI, newJ, board, newPrefix, newWords, newAlreadyVisit));
            }
        }

        //to go right
        newI = i;
        newJ = j + 1;
        visit = new Pair(newI,newJ);
        if(validPath(newI,newJ,board) && !alreadyVisit.contains(visit)){
            newPrefix = prefix + String.valueOf(board[newI][newJ]);
            newWords = startWith(prefix,words);
            newAlreadyVisit = new HashSet<Pair>(alreadyVisit);
            newAlreadyVisit.add(visit);
            if(!newWords.isEmpty()){
                result.addAll(goSearch(newI, newJ, board, newPrefix, newWords, newAlreadyVisit));
            }
        }

        //to go up
        newI = i-1;
        newJ = j;
        visit = new Pair(newI,newJ);
        if(validPath(newI,newJ,board) && !alreadyVisit.contains(visit)){
            newPrefix = prefix + String.valueOf(board[newI][newJ]);
            newWords = startWith(prefix,words);
            newAlreadyVisit = new HashSet<Pair>(alreadyVisit);
            newAlreadyVisit.add(visit);
            if(!newWords.isEmpty()){
                result.addAll(goSearch(newI, newJ, board, newPrefix, newWords, newAlreadyVisit));
            }
        }

        //to go down
        newI = i+1;
        newJ = j;
        visit = new Pair(newI,newJ);
        if(validPath(newI,newJ,board) && !alreadyVisit.contains(visit)){
            newPrefix = prefix + String.valueOf(board[newI][newJ]);
            newWords = startWith(prefix,words);
            newAlreadyVisit = new HashSet<Pair>(alreadyVisit);
            newAlreadyVisit.add(visit);
            if(!newWords.isEmpty()){
                result.addAll(goSearch(newI, newJ, board, newPrefix, newWords, newAlreadyVisit));
            }
        }

        return result;
    }

    public boolean validPath(int i,int j,char[][] board){
        if(i < 0 || i >= board.length) return false;
        if(j < 0 || j >= board[i].length) return false;
        return true;
    }

    public List<String> startWith(String prefix, List<String> words){
        List<String> result = new ArrayList<>();

        for(String s : words){
            if(s.startsWith(prefix)) result.add(s);
        }

        return result;
    }

    public class Pair {
        public Pair(int newI, int newJ) {

        }

        protected Object getKey() {
            return null;
        }

        protected Object getValue() {
            return null;
        }
    }
}
