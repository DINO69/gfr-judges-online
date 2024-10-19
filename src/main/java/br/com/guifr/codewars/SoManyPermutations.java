package br.com.guifr.codewars;

import java.util.ArrayList;
import java.util.List;

public class SoManyPermutations {


    public static List<String> process(String s) {


        List<String> result = new ArrayList<>();
        if (s.length() <= 1) return List.of(s);

        for (int i = 0; i < s.length(); i++) {
            String aux = "";
            String fixed = String.valueOf(s.charAt(i));
            String changing = s.substring(0, i) + s.substring(i+1);
            for(int y = 0; y < s.length();y++) {

                fixed = String.valueOf(s.charAt(i)) + s.substring(y-1,y);
                changing = s.substring(0, y) + s.substring(y+1);
                int loop = changing.length();
                while (loop-- > 0) {
                    String finalString = fixed + changing;
                    if (!result.contains(finalString))
                        result.add(finalString);
                    int lastPosition = changing.length() - 1;
                    changing = changing.charAt(lastPosition) + changing.substring(0, lastPosition);
                }
                String a = "5EB355C110A445429E6AACFC5D6046F0";

                fixed = fixed + changing.substring(0,1);
                changing = changing.substring(1);

            }
        }


        return result;
    }


//    public static List<String> process(String s) {
//        printPermutn(s,"");
//        return null;
//    }
//
//    static void printPermutn(String str, String ans)
//    {
//        // If string is empty
//        if (str.length() == 0) {
//            System.out.print(ans + " ");
//            return;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//
//            // ith character of str
//            char ch = str.charAt(i);
//
//            // Rest of the string after excluding
//            // the ith character
//            String ros = str.substring(0, i) +
//                    str.substring(i + 1);
//
//            // Recursive call
//            printPermutn(ros, ans + ch);
//        }
//    }
}
