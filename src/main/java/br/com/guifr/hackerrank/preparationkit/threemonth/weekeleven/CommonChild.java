package br.com.guifr.hackerrank.preparationkit.threemonth.weekeleven;

public class CommonChild {

    //solution
    public static int commonChild(String s1, String s2) {

        int dp[][] = new int[s1.length()+1][s2.length()+1];

        for(int i=1; i<=s1.length(); i++) {
            for(int j=1; j<=s2.length(); j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

    public static int with(String s1, String s2) {
        s1 = cleanString(s1,s2);
        s2 = cleanString(s2,s1);

        int result = findMax(s1,s2,0);

        return result;
    }

    private static int findMax(String s1,String s2, int length){
        int result = length;
        for(int i = 0;i < s1.length();i++){
            char c = s1.charAt(i);
            int occurs = 0;
            while(s2.indexOf(c,occurs) != -1) {
                int indexFound = s2.indexOf(c,occurs);
                String newS1 = s1.substring(i + 1);
                String newS2 = s2.substring(indexFound + 1);
                int maxPossible = length + newS2.length();
                if(result > maxPossible) break;
                result = Math.max(result,findMax(newS1,newS2, length + 1));
                occurs = indexFound + 1;
            }
            int maxPossible = length + s2.length();
            if(result > maxPossible) break;
        }

        return result;
    }

    public static String cleanString(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        for(String s : s1.split("")){
            if(s2.contains(s)) sb.append(s);
        }
        return sb.toString();
    }

}
