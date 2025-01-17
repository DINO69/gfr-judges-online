package br.com.guifr.top75leetcodequestions.dynamicprogramming;

import java.util.*;

public class UglyNumber2 {

    public int nthUglyNumber(int n) {
        if(n <= 3) return n;

        Map<Integer,Boolean> numbers = new HashMap<>();

        int number = 1;

        while(n > 0){
            if(ugly(number,5,numbers)) {
                n--;
            }
            number++;
        }

        return number-1;
    }

    public boolean ugly(int n, int startMod, Map<Integer,Boolean> numbers){
        //if(numbers.get(n) != null) return numbers.get(n);
        boolean result = false;
        if(n == 1) result = true;
        if(n % startMod == 0) return ugly(n / startMod, startMod,numbers);
        if(startMod > 2) return ugly(n, (startMod>>1) + 1,numbers);
        //numbers.put(n, result);
        return result;
    }


    public int nthUglyNumber_O_1690(int n) {
        int[] num = new int[1690];
        num[0] = 1;
        int ugly = 0, i2 = 0, i3 = 0, i5 = 0;

        for (int i = 1; i < 1690; i++) {
            num[i] = Math.min(Math.min(2 * num[i2], 3 * num[i3]), 5 * num[i5]);
            ugly = num[i];

            if (num[i2] * 2 == ugly)
                i2++;
            if (num[i3] * 3 == ugly)
                i3++;
            if (num[i5] * 5 == ugly)
                i5++;
        }

        return num[n - 1];
    }


}
