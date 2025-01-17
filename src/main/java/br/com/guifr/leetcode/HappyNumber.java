package br.com.guifr.leetcode;

public class HappyNumber {

    public boolean isHappy(int n) {
        if(n == 1 || n == 10 || n == 7) return true;
        if(n < 10) return false;

        int next = 0;

        while(n > 0){
            int mod = n % 10;
            next += Math.pow(mod,2);
            n = n / 10;
        }

        return isHappy(next);

    }

}
