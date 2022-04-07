package br.com.guifr.hackerrank;

import java.util.Collections;
import java.util.List;

public class SalesByMatch {


    public static int of(List<Integer> asList) {
        Collections.sort(asList);

        int result = 0;
        int same = asList.get(0);
        int qtdSame = 0;

        for(Integer number : asList){
            if(number == same){
                qtdSame++;
                continue;
            }
            same = number;
            result += ( qtdSame / 2 );
            qtdSame = 1;
        }
        result += ( qtdSame / 2 );

        return result;
    }
}
