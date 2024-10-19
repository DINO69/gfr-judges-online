package br.com.guifr.leetcode;

public class GreatestCommonDivisorStrings {


    public static String gcdOfStrings(String str1, String str2) {
        String result = "";
        int min = Math.min(str1.length(),str2.length());
        for(int i = 0; i < min; i++){
            String x = str1.substring(0,i+1);
            String auxStr1 = str1;
            String auxStr2 = str2;
            auxStr1 = auxStr1.replaceAll(x, "");
            auxStr2 = auxStr2.replaceAll(x, "");
            if(auxStr1.isEmpty() && auxStr2.isEmpty()){
                result = x;
            }
        }
        return result;
    }
}
