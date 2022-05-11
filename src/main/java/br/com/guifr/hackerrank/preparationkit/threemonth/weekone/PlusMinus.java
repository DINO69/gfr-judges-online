package br.com.guifr.hackerrank.preparationkit.threemonth.weekone;

import java.util.List;
import java.util.Locale;

public class PlusMinus {

    public static String with(List<Integer> arr) {
        int greater = 0;
        int lesser = 0;
        int zero = 0;
        for(int number : arr){
            if(number > 0){
                greater++;
            }else if (number < 0){
                lesser++;
            }else{
                zero++;
            }
        }

        double dGreater = greater  * 1.0 / arr.size() ;
        double dLesser = lesser  * 1.0 / arr.size();
        double dZero = zero  * 1.0 / arr.size();

        return String.format(Locale.US,"%.6f\n%.6f\n%.6f",dGreater,dLesser,dZero);

    }
}
