package br.com.guifr.hackerrank.preparationkit.threemonth.weekfour;

public class NumberLineJumps {


    public static String with(int position1, int jump1, int position2, int jump2) {

        for(int i = 1;i<=10000;i++){

            int positionFinal1 = i * jump1 + position1;
            int positionFinal2 = i * jump2 + position2;
            if(positionFinal1 == positionFinal2){
                return "YES";
            }

        }

        return "NO";
    }

    public static String withCalc(int position1, int jump1, int position2, int jump2) {
        // equation
        // x1 + x * v1 = x2 + x * v2
        // x * v1 - x * v2 = x2 - x1
        // x * (v1 - v2) = x2 - x1
        // x = (x2 - x1) / (v1 - v2)

        int divisor = jump1 - jump2;
        int dividend = position2 - position1;

        int x = divisor != 0 && dividend % divisor == 0 ? dividend / divisor : -1;
        return x >= 0 ? "YES" : "NO";
    }
}
