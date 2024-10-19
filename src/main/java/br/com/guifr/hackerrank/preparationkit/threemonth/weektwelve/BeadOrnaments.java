package br.com.guifr.hackerrank.preparationkit.threemonth.weektwelve;

import java.util.List;

public class BeadOrnaments {

    private static final long MOD = 1000000007;

    public static long power(long a, int pow) {
        long res = a % MOD;
        int count = 1;

        while (count < pow) {
            res = (res * a) % MOD;
            count++;
        }
        if (pow == 0) {
            return 1;
        }

        return res;
    }

    public static int beadOrnaments(List<Integer> b) {
// Write your code here
        int n = b.size();

        long sum = 0;
        long trees = 1;

        for (Integer i : b) {
            sum = (sum + i) % MOD;

            //this i - 2 + 1 is also from Cayley formula
            //first: number of sub trees are found using power(i, i - 2)
            //one leaf of a sub tree will connect with root of another
            //   sub tree
            //hence there are i ways of connecting as there should be
            //   i leaves in each tree
            //therefore power(i, i - 2) * i == power(i, i - 2 + 1)

            trees = (trees * power(i, i - 2 + 1)) % MOD;
        }

        if (n >= 2) {

            //Cayley formular
            //https://www.geeksforgeeks.org/cayleys-formula/

            trees = (trees * power(sum, n - 2)) % MOD;
        } else {
            trees = (long) Math.floor(trees / sum);
        }

        return (int) (trees % MOD);
    }

//    public static int beadOrnaments(List<Integer> b) {
//
//        int MOD = 1000000007;
//
//        int ans = b.stream().reduce(1, (y, a) -> (int) (y * Math.pow(a,(a - 1.0)) % MOD) );
//
//        int sum = b.stream().reduce(0,(y, a) -> (y + a));
//
//        if (b.size() - 2 >= 0) {
//            ans *= Math.pow(sum ,(b.size() - 2));
//        } else {
//            ans /= sum;
//        }
////        return ans % MOD;
//        return ans;
//    }
}
