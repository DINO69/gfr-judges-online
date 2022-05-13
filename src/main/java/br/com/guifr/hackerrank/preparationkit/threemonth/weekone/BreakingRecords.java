package br.com.guifr.hackerrank.preparationkit.threemonth.weekone;

import java.util.Arrays;
import java.util.List;

public class BreakingRecords {

    public static List<Integer> records(List<Integer> scores) {
        int most = scores.get(0), least = scores.get(0), countmax = 0, countmin = 0;

        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > most) {
                most = scores.get(i);
                countmax++;
            } else if (scores.get(i) < least) {
                least = scores.get(i);
                countmin++;
            }
        }

        return Arrays.asList(countmax, countmin);
    }
}
