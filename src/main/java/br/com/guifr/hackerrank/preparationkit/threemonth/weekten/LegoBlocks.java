package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

public class LegoBlocks {

    private static final int FATOR = 1000000000 + 7;

    public static int buildWall(int h, int w) {
        return 9 % FATOR;
    }

    private static final int MOD = 1000000007;
    /*
     * Complete the 'legoBlocks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */
    public static int legoBlocks(int n, int m) {
        // Write your code here
        long dpLowest[] = new long[m+1];
        long dpAll[] = new long[m+1];
        long dpGood[] = new long[m+1];

        for(int j=1; j<=m; j++) {
            if (j == 1) {
                dpLowest[j] = 1;
            } else if (j == 2) {
                dpLowest[j] = 2;
            } else if (j == 3) {
                dpLowest[j] = 4;
            } else if (j == 4) {
                dpLowest[j] = 8; // 1111 112 121 13 211 22 31 4
            } else {
                dpLowest[j] = mod(dpLowest[j-1] + dpLowest[j-2] + dpLowest[j-3] + dpLowest[j-4], MOD);
            }
        }

        for(int i=1; i<=m; i++) {
            dpAll[i] = 1;
            for(int j=1; j<=n; j++)
                dpAll[i] = mod(dpLowest[i]*dpAll[i], MOD);
        }

        for(int i=1; i<=m; i++) {
            if (i == 1) {
                dpGood[i] = 1;
                continue;
            }
            dpGood[i] = dpAll[i];
            for(int j=1; j<i; j++) {
                dpGood[i] = mod(dpGood[i]- (dpGood[i-j]*dpAll[j]), MOD);
            }
        }

        return  (int)mod(dpGood[m], MOD);
    }

    private static long mod(long l1, int modN) {
        long modded = l1%modN;
        if (modded < 0) {
            modded+= modN;
        }
        return modded;
    }

}
