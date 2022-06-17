package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumXor {

    public static long vs(long number) {
        if(number == 0) return 1;
        long pow = (long) Math.pow(2, countZerosFromBinary(number));
        return pow;
    }

    public static long vsLoop(long number) {
        int result = 0;
        for(long i = 0; i <= number / 2;i++){
            if((i + number) == (number ^ i)){
                result++;
            }
            long last = number - i;
            if((last + number) == (number ^ last) && last != i){
                result++;
            }
        }

        return result;
    }

    public static int countZerosFromBinary(long number) {
        String binary = CounterGame.convertToBinary(number);
        Pattern p = Pattern.compile("0");
        Matcher m = p.matcher(binary);
        int res = 0;
        while (m.find()) {
            res++;
        }
        return res;
    }
}
