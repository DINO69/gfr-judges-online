package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

public class PalindromeIndex {


    public static int with(String s) {

        if (isEqualOwnReverse(s)) {
            return -1;
        }

        String[] split = s.split("");
        int start = 0;
        int last = s.length() - 1;
        while (start < last) {
            if (split[last].equals(split[start])) {
                last--;
                start++;
            } else {

                if (isEqualOwnReverse(subtractFirstLetter(s,start, last).toString())){
                    return start;
                }

                if (isEqualOwnReverse(subtractLastLetter(s,start, last).toString())){
                    return last;
                }

                return -1;

            }

        }

        return -1;

    }

    private static boolean isEqualOwnReverse(String s) {
        StringBuilder reverse = new StringBuilder(s);
        reverse.reverse();
        return s.equals(reverse.toString());
    }

    private static StringBuilder subtractFirstLetter(String s, int start, int last) {
        return new StringBuilder(s.substring(start+1, last+1));
    }

    private static StringBuilder subtractLastLetter(String s, int start, int last) {
        return new StringBuilder(s.substring(start, last));
    }
}
