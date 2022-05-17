package br.com.guifr.hackerrank.preparationkit.threemonth.weektwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarsExploration {

    public static int request(String sos) {
        int result = 0;
        Pattern p = Pattern.compile("(\\S{3})");
        Matcher m = p.matcher(sos);
        while(m.find()){
            result += appraisement(m.group());
        }
        return result;
    }

    public static int appraisement(String simpleSos) {
        int result = 0;
        if(simpleSos.charAt(0) != 'S') result++;
        if(simpleSos.charAt(1) != 'O') result++;
        if(simpleSos.charAt(2) != 'S') result++;

        return result;
    }
}
