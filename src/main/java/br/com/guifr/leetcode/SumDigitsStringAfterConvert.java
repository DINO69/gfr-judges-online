package br.com.guifr.leetcode;

public class SumDigitsStringAfterConvert {

    public int getLucky(String s, int k) {
        String process = transformToNumbers(s);
        return Integer.parseInt(convertSum(process,k));
    }

    public String convertSum(String s, int k){
        if(k == 0) return s;
        k--;

        int result = 0;
        for(Character c : s.toCharArray()){
            result += Integer.parseInt(String.valueOf(c));
        }
        System.out.println(result);

        return convertSum(String.valueOf(result),k);

    }

    public String transformToNumbers(String s){
        StringBuilder result = new StringBuilder();
        for(Character c : s.toCharArray()){
            result.append(String.valueOf((int) (c - 'a' + 1)));
        }
        System.out.println(result);
        return result.toString();
    }
}
