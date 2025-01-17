package br.com.guifr.top75leetcodequestions.graph;

public class FindChampionTwo {

    public int findChampion(int n, int[][] edges) {
        int result = -1;

        int[] weakness = new int[n];

        for(int[] match : edges){
            int stronger = match[0];
            int weaker = match[1];
            weakness[weaker] = 1;
        }

        while(--n >= 0){
            //System.out.println(n);
            if(weakness[n] == 0) {
                if(result != -1) return -1;
                result = n;
            }
        }

        return result;
    }

}
