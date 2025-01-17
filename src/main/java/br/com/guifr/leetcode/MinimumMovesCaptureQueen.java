package br.com.guifr.leetcode;

import java.util.*;

//https://leetcode.com/problems/minimum-moves-to-capture-the-queen/description/
public class MinimumMovesCaptureQueen {

    public static void main(String[] args) {
        System.out.println(minMovesToCaptureTheQueen(1,1,8,8,2,3));
        System.out.println(minMovesToCaptureTheQueen(1,6,3,3,5,6));
        System.out.println(minMovesToCaptureTheQueen(4,3,3,4,5,2));
    }

    public static int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {

        Result result = new Result();
        tryGetQueen(new Rock(),0,new Pair(a,b),e,f,new HashMap<>(),new HashSet<>(), result);
        tryGetQueen(new Bishop(),0,new Pair(c,d),e,f,new HashMap<>(),new HashSet<>(), result);
        //int bishop = tryGetQueenBishop(0,a,b,e,f,new HashMap<>(),new HashSet<>(), result);

        return result.min;
    }

    public static boolean validPlace(Pair p){
        if(p.pieceR < 1 || p.pieceR > 8) return false;
        if(p.pieceC < 1 || p.pieceC > 8) return false;
        return true;
    }
    public static Pair add(Pair p, Pair p1){
        return new Pair(p.pieceR+p1.pieceR,p.pieceC+p1.pieceC);
    }

    public static void tryGetQueen(Piece piece, int step, Pair mov, int queenR, int queenC, Map<Pair,Integer> visited, Set<Pair> path, Result min) {

        int pieceR = mov.pieceR;
        int pieceC = mov.pieceC;
        StringBuilder sb = new StringBuilder();
        sb.hashCode();

        if(pieceR < 1 || pieceR > 8) return;
        if(pieceC < 1 || pieceC > 8) return;

        Pair p = new Pair(pieceR,pieceC);

        if(pieceR == queenR && pieceC == queenC) {
            min.min = Math.min(step,min.min);
            return;
        }

        if(path.contains(p))
            return;

        if(step >= min.min)
            return;

        path.add(p);


        if(visited.get(p) != null)
            min.min = Math.min(visited.get(p), step + 1);

        Pair next = new Pair(mov.pieceR,mov.pieceC);
        while(validPlace(add(next,piece.jump1()))){
            tryGetQueen(piece,step+1, add(next,piece.jump1()), queenR, queenC, visited, new HashSet<>(path),min);
            next = add(next,piece.jump1());
        }

        //int toDown = tryGetQueen(step+1,pieceR + 1, pieceC, queenR, queenC, visited, new HashSet<>(path),min);
        next = new Pair(mov.pieceR,mov.pieceC);
        while(validPlace(add(next,piece.jump2()))){
            tryGetQueen(piece,step+1, add(next,piece.jump2()), queenR, queenC, visited, new HashSet<>(path),min);
            next = add(next,piece.jump2());
        }
//        int minUpDown = Math.min(toUp,toDown);
//
        //int toLeft = tryGetQueen(step+1, pieceR, pieceC - 1, queenR, queenC, visited, new HashSet<>(path),min);
        next = new Pair(mov.pieceR,mov.pieceC);
        while(validPlace(add(next,piece.jump3()))){
            tryGetQueen(piece,step+1, add(next,piece.jump3()), queenR, queenC, visited, new HashSet<>(path),min);
            next = add(next,piece.jump3());
        }
//        int toRight = tryGetQueen(step+1, pieceR, pieceC + 1, queenR, queenC, visited ,new HashSet<>(path),min);
        next = new Pair(mov.pieceR,mov.pieceC);
        while(validPlace(add(next,piece.jump4()))){
            tryGetQueen(piece,step+1, add(next,piece.jump4()), queenR, queenC, visited, new HashSet<>(path),min);
            next = add(next,piece.jump4());
        }
//        int minLeftRight = Math.min(toLeft,toRight);
//        if(Math.min(minUpDown,minLeftRight) == 1){
//            System.out.println(Math.min(minUpDown,minLeftRight));
//            System.out.println(pieceR);
//            System.out.println(pieceC);
//        }

//        int result = Math.min(minUpDown,minLeftRight);



        visited.put(p,min.min);

//        return result;
    }

    public static abstract class Piece{
        abstract Pair jump1();
        abstract Pair jump2();
        abstract Pair jump3();
        abstract Pair jump4();
    }

    public static class Bishop extends Piece{
        @Override
        Pair jump1() {//toUpLeft
            return new Pair(-1,-1);
        }

        @Override
        Pair jump2() {//toUpRight
            return new Pair(-1,+1);
        }

        @Override
        Pair jump3() {//toDownLeft
            return new Pair(+1,-1);
        }

        @Override
        Pair jump4() {//toDownRigth
            return new Pair(+1,+1);
        }
    }

    public static class Rock extends Piece{

        @Override
        Pair jump1() {//toUp
            return new Pair(-1,0);
        }

        @Override
        Pair jump2() {//toDown
            return new Pair(+1,0);
        }

        @Override
        Pair jump3() {//toLeft
            return new Pair(0,-1);
        }

        @Override
        Pair jump4() {//toRight
            return new Pair(0,+1);
        }
    }

    public static class Result{
        int min = Integer.MAX_VALUE;
    }

    public static int tryGetQueenBishop(int step, int pieceR, int pieceC, int queenR, int queenC, Map<Pair,Integer> visited, Set<Pair> path, Result min){

        if(pieceR < 1 || pieceR > 8) return Integer.MAX_VALUE;
        if(pieceC < 1 || pieceC > 8) return Integer.MAX_VALUE;

        Pair p = new Pair(pieceR,pieceC);

        if(pieceR == queenR && pieceC == queenC) {
            min.min = Math.min(step,min.min);
            return min.min;
        }

        if(path.contains(p))
            return Integer.MAX_VALUE;

        if(step >= min.min)
            return min.min;

        path.add(p);


        if(visited.get(p) != null)
            return Math.min(visited.get(p), step + 1);


        int toUpLeft = tryGetQueenBishop(step+1, pieceR - 1, pieceC - 1, queenR, queenC, visited, new HashSet<>(path),min);
        int toUpRight = tryGetQueenBishop(step+1,pieceR - 1, pieceC + 1, queenR, queenC, visited, new HashSet<>(path),min);
        int minUpDown = Math.min(toUpLeft,toUpRight);

        int toDownLeft = tryGetQueenBishop(step+1, pieceR + 1, pieceC - 1, queenR, queenC, visited, new HashSet<>(path),min);
        int toDownRight = tryGetQueenBishop(step+1, pieceR + 1, pieceC + 1, queenR, queenC, visited ,new HashSet<>(path),min);
        int minLeftRight = Math.min(toDownLeft,toDownRight);
        if(Math.min(minUpDown,minLeftRight) == 1){
            System.out.println(Math.min(minUpDown,minLeftRight));
            System.out.println(pieceR);
            System.out.println(pieceC);
        }

        int result = Math.min(minUpDown,minLeftRight);



        visited.put(p,result);

        return result;

    }

    public static int tryGetQueen(int step, int pieceR, int pieceC, int queenR, int queenC, Map<Pair,Integer> visited, Set<Pair> path, Result min){

        if(pieceR < 1 || pieceR > 8) return Integer.MAX_VALUE;
        if(pieceC < 1 || pieceC > 8) return Integer.MAX_VALUE;

        Pair p = new Pair(pieceR,pieceC);

        if(pieceR == queenR && pieceC == queenC) {
            min.min = Math.min(step,min.min);
            return min.min;
        }

        if(path.contains(p))
            return Integer.MAX_VALUE;

        if(step >= min.min)
            return min.min;

        path.add(p);


        if(visited.get(p) != null)
            return Math.min(visited.get(p), step + 1);


        int toUp = tryGetQueen(step+1, pieceR - 1, pieceC, queenR, queenC, visited, new HashSet<>(path),min);
        int toDown = tryGetQueen(step+1,pieceR + 1, pieceC, queenR, queenC, visited, new HashSet<>(path),min);
        int minUpDown = Math.min(toUp,toDown);

        int toLeft = tryGetQueen(step+1, pieceR, pieceC - 1, queenR, queenC, visited, new HashSet<>(path),min);
        int toRight = tryGetQueen(step+1, pieceR, pieceC + 1, queenR, queenC, visited ,new HashSet<>(path),min);
        int minLeftRight = Math.min(toLeft,toRight);
        if(Math.min(minUpDown,minLeftRight) == 1){
            System.out.println(Math.min(minUpDown,minLeftRight));
            System.out.println(pieceR);
            System.out.println(pieceC);
        }

        int result = Math.min(minUpDown,minLeftRight);

        visited.put(p,result);

        return result;

    }

    private static class Pair {
        int pieceR, pieceC;
        public Pair(int pieceR, int pieceC) {
            this.pieceC = pieceC;
            this.pieceR = pieceR;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return pieceR == pair.pieceR && pieceC == pair.pieceC;
        }

        @Override
        public int hashCode() {
            return Objects.hash(pieceR, pieceC);
        }
    }
}
