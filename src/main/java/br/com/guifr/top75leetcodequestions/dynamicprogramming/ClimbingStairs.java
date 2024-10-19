package br.com.guifr.top75leetcodequestions.dynamicprogramming;

public class ClimbingStairs {

    public int climbStairs(int n) {

        if( n <= 3) return n;

        //return climbStairs(n-2) + climbStairs(n-1);


        int values[] = new int[n + 1];
        values[0] = 1;
        values[1] = 1;
        values[2] = 2;
        values[3] = 3;

        for(int step = 3; step <= n;step++){
            values[step] = values[step-2] + values[step - 1];
        }

        return values[n];


    }

}
