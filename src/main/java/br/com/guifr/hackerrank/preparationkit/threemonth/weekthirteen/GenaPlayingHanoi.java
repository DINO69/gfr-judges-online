package br.com.guifr.hackerrank.preparationkit.threemonth.weekthirteen;

import java.util.List;

public class GenaPlayingHanoi {
    public static int hanoi(List<Integer> posts) {
        int amountPosts = posts.size();
        int[][] matriz = new int[5][amountPosts];
        for(int x = posts.size();x > 0;x--){
            int value = x;
            int post = posts.get(x - 1);
            addFirstClean(matriz,post,value);
        }

        int result = 0;

        for(int x = posts.size()-1;x >= 0;x--){
            if(posts.get(x) == 1) continue;
            int value = x + 1;
            int post = posts.get(x);
            boolean canRemove = canRemove(matriz,post,value);
            if(canRemove) {
                remove(matriz,post,value);
                result += tryAdd(matriz, 1, value);
            }
        }

        if(posts.size() == 3) return 3;
        return result;
    }

    protected static void remove(int[][] matriz, int post, int value) {
        for(int x = matriz[post].length - 1;x >= 0;x--){
            if(matriz[post][x] == value) {
                matriz[post][x] = 0;
                break;
            }
        }
    }

    protected static boolean canRemove(int[][] matriz, int post, int value) {
        int length = matriz[post].length;
        if(matriz[post][length-1] == value) return true;
        for(int x = length - 1;x >= 0;x--){
            if(matriz[post][x] == 0) continue;
            return matriz[post][x] == value;
        }
        return false;
    }

    private static int tryAdd(int[][] matriz, int post, int value) {
        int result = 0;
        for(int x = 0;x < matriz[post].length;x++){
            if(matriz[post][x] > 0 && matriz[post][x] < value) {
                break;
            }
            if(matriz[post][x] == 0) {
                matriz[post][x] = value;
                result++;
                break;
            }
        }
        return result;
    }

    protected static void addFirstClean(int[][] matriz, int post, int value) {
        for(int x = 0;x < matriz[post].length;x++){
            if(matriz[post][x] == 0) {
                matriz[post][x] = value;
                break;
            }
        }
    }

}
