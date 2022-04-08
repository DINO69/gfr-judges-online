package br.com.guifr.hackerrank;

import java.util.List;

public class JumpingClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        for(int x = 0; x < c.size() - 1; x++){
            if(x + 2 < c.size())
                if(c.get(x + 2) == 0){
                    x++;
                }
            jumps++;
        }
        return jumps;
    }

}
