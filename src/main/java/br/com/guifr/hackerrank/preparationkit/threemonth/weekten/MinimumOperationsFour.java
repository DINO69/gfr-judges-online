package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import java.util.Scanner;
import java.util.Vector;

public class MinimumOperationsFour {
    private static final Scanner scan = new Scanner(System.in);
    int n, r ,g, b;
    int[][] dp = new int[110][1<<3];

    Vector<Integer> red = new Vector();
    Vector<Integer> green = new Vector();
    Vector<Integer> blue = new Vector();

    public void get() {
        n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            r = scan.nextInt();
            g = scan.nextInt();
            b = scan.nextInt();
            red.add(r);
            green.add(g);
            blue.add(b);
        }
    }

    public static void main(String[] args) {
        int j = 0;
        for (j = 0; j < 7; j++){
            System.out.println(j | 1);
            System.out.println(j | 2);
            System.out.println(j | 4);
        }
    }

    public void minOperations() {
        int i, j;

        initializeDp();

        dp[0][0] = 0;
        for (i = 0; i < n; i++){
            for (j = 0; j < 7; j++){
                dp[i + 1][j | 1] = Math.min(dp[i + 1][j | 1], dp[i][j] + green.get(i) + blue.get(i));//red
                dp[i + 1][j | 2] = Math.min(dp[i + 1][j | 2], dp[i][j] + red.get(i) + blue.get(i));//green
                dp[i + 1][j | 4] = Math.min(dp[i + 1][j | 4], dp[i][j] + red.get(i) + green.get(i));//blue
            }
        }

        j = 0;

        for (i = 0; i < n; i++){
            if (green.get(i) != 0) j |= 1;
            if (red.get(i) != 0) j |= 2;
            if (blue.get(i) != 0) j |= 4;
        }

        if (dp[n][j] >= (1<<30)) dp[n][j] = -1;

        System.out.println(dp[n][j]);
    }

    private void initializeDp() {
        int i;
        int j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= 7; j++) {
                dp[i][j] = (1<<30);
            }
        }
    }
}
class Solution {
    public static void main(String[] args) {
        MinimumOperationsFour obj = new MinimumOperationsFour();
        obj.get();
        obj.minOperations();
    }
}
