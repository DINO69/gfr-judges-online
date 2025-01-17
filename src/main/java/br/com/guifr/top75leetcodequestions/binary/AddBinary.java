package br.com.guifr.top75leetcodequestions.binary;

public class AddBinary {

    public static String addBinary(String a, String b) {
        int i = 1;
        int next = 0;
        int actual = 0;
        StringBuilder sb = new StringBuilder();
        while(i <= a.length() || i <= b.length() || next == 1){
            int nA = 0;
            int nB = 0;
            if(a.length() - i >= 0){
                nA = Integer.parseInt(String.valueOf(a.charAt(a.length() - i)));
            }

            if(b.length() - i >= 0){
                nB = Integer.parseInt(String.valueOf(b.charAt(b.length() - i)));
            }

            // 1 1 - 0
            // 1 0 - 1
            // 0 1 - 1
            // 0 0 - 0
            actual = nA ^ nB ^ next;

            // 1 1 - 1
            // 1 0 - 0
            // 0 1 - 0
            // 0 0 - 0
            //
            // 1 1 - 1
            // 1 0 - 0
            // 0 1 - 0
            // 0 0 - 0
            next = (nA & next ) | (nB & next) | (nA & nB);


            sb.insert(0, String.valueOf(actual));

            i++;
        }


        return sb.toString();
    }

}
