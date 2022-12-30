package br.com.guifr.hackerrank.preparationkit.threemonth.weekeleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HighestValuePalindrome {

    public static String when(String s, int k) {
        int lengthPalindrome = s.length();
        StringBuilder newPalindrome = new StringBuilder(s);
        List<Integer> indexChanged = new ArrayList<>();

        if (k == 0) return isPalindrome(s) ? s : "-1";
        if (k + countNines(s) >= lengthPalindrome) return buildMaxPalindrome(lengthPalindrome);
        if (!transformInPalindrome(newPalindrome, indexChanged,k)) return "-1";

        k -= indexChanged.size();

        improvePalindrome: while (k > 0 && !maxPalindrome(newPalindrome.toString())) {
            if (k == 1) {
                for (int ic : indexChanged) {
                    if (newPalindrome.charAt(ic) != '9') {
                        replace(newPalindrome,ic,"9");
                        break improvePalindrome;
                    }
                }
            }
            if (k == 1 && isEven(newPalindrome)) break;
            if (k == 1) {
                int middle = lengthPalindrome >> 1;
                newPalindrome.replace(middle, middle + 1, "9");
                break;
            }
            int start = 0;
            while (k >= 2 && start <= (lengthPalindrome >> 1)) {
                k -= 2;
                while (newPalindrome.charAt(start) == '9') start++;
                if(indexChanged.contains(start)) k++;
                replace(newPalindrome,start,"9");
            }
        }

        return newPalindrome.toString();

    }

    private static void replace(StringBuilder newPalindrome,int startPosition, String value){
        int lastPosition = newPalindrome.length();
        newPalindrome.replace(startPosition, startPosition + 1, value);
        newPalindrome.replace(lastPosition - 1 - startPosition, lastPosition - startPosition, value);
    }

    private static boolean transformInPalindrome(StringBuilder newPalindrome,List<Integer> indexChanged,int maxChanged){
        int startChange = 0;
        int lastChange = newPalindrome.length() - 1;
        int changed = 0;
        while (startChange < lastChange) {
            char firstChar = newPalindrome.charAt(startChange);
            char lastChar = newPalindrome.charAt(lastChange);
            char maxChar = (char) Math.max(firstChar, lastChar);

            if (!(firstChar == lastChar)) {
                changed++;
                if(changed > maxChanged) return false;
                indexChanged.add(startChange);
                replace(newPalindrome,startChange,String.valueOf(maxChar));
            }
            startChange++;
            lastChange--;
        }
        return true;
    }

    private static boolean isEven(String s) {
        return s.length() % 2 == 0;
    }

    private static boolean isEven(StringBuilder s) {
        return isEven(s.toString());
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }

    public static boolean maxPalindrome(String s) {
        return s.charAt(0) == '9' && Arrays.stream(s.split(""))
                .distinct()
                .count() == 1;
    }

    public static String buildMaxPalindrome(int length) {
        StringBuilder sb = new StringBuilder();
        while (length-- > 0) sb.append("9");
        return sb.toString();
    }

    public static int countNines(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int result = 0;
        while (sb.indexOf("9", start) != -1) {
            start = sb.indexOf("9", start) + 1;
            result++;
        }
        return result;
    }

}
