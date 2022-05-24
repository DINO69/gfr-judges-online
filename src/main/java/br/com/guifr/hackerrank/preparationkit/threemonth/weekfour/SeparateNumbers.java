package br.com.guifr.hackerrank.preparationkit.threemonth.weekfour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class SeparateNumbers {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                separateNumbers(s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    public static void separateNumbers(String s) {

        System.out.println(beautifulMode(s));

    }

    public static String beautifulMode(String s) {

        long num1 = 0;
        long num2 = 0;
        long firstElement = -1;

        int lengthEnd = 1;
        int starSecond = 1;
        int starFirst = 0;

        while (lengthEnd + starSecond <= s.length() && lengthEnd >= 1) {
            num1 = Long.valueOf(s.substring(starFirst, starSecond));
            String stringtoNum2 = s.substring(starSecond, starSecond + lengthEnd);

            if(stringtoNum2.substring(0,1).equals("0")){
                starSecond++;
                lengthEnd++;
                continue;
            }

            num2 = Long.valueOf(stringtoNum2);

            if (num2 - num1 == 1) {
                starFirst = starSecond;
                starSecond = starSecond + lengthEnd;
                lengthEnd = Math.min(lengthEnd,s.length() - starSecond);
                if (firstElement == -1) {
                    firstElement = num1;
                }
                continue;
            }

            if (num1 >= num2) {
                lengthEnd++;
            } else if (num2 > num1) {
                starFirst--;
                if(starFirst < 0){
                    starFirst = 0;
                    starSecond++;
                }
                firstElement = -1;
            }
        }

        if (firstElement != -1 && num2 - num1 == 1) {
            return String.format("%s %d", "YES", firstElement);
        } else {
            return "NO";
        }

    }

    public static String beautifulModeCalcMid(String s) {

        for(int end = 0;end < s.length() / 2; end++){
            StringBuilder sbTemp = new StringBuilder();
            long temp = Long.valueOf(s.substring(0,end + 1));
            long first = temp;
            while(sbTemp.toString().length() < s.length()){
                sbTemp.append(String.valueOf(temp));
                temp++;
            }

            if(s.equals(sbTemp.toString())){
                return "YES " + first;
            }
        }
        return "NO";
    }
}
