package br.com.guifr.top75leetcodequestions.dynamicprogramming;

public class UglyNumber {

    public static void main(String[] args) {
        System.out.println((5 >> 1) + 1);
        System.out.println((3 >> 1) + 1);
    }

    public boolean isUgly(int n) {
        if(n <= 0) return false;
        if(n <= 5) return true;

        int mod = 5;

        while(n % mod == 0 || mod != 2){
            System.out.println(n);
            if(n % mod == 0) n = n / mod;
            else mod = (mod >> 1) + 1;
        }

        return n == 1 ? true : false;

    }

}
