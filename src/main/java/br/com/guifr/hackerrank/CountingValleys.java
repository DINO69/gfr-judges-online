package br.com.guifr.hackerrank;

public class CountingValleys {

    public static int stepsHike(int i, String path) {
        int sea = 0;
        int valley = 0;
        int level = 0;

        boolean belowSea = false;
        for(String step : path.split("")){
            if("D".equals(step))
                level--;

            if("U".equals(step))
                level++;

            if(level < sea) {
                if(!belowSea)
                    valley++;
                belowSea = true;
            }else{
                belowSea = false;
            }

        }
        return valley;
    }

}
