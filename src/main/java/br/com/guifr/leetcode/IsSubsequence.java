package br.com.guifr.leetcode;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;

        int findIndex = 0;
        for(char mainChar : t.toCharArray()){
            if(s.charAt(findIndex) == mainChar){
                findIndex++;
                if(findIndex == s.length()) return true;
                //System.out.println(mainChar);
            }
        }
        return findIndex == s.length();
    }

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        boolean subsequence = isSubsequence.isSubsequence("abc", "ahbgdc");
        System.out.println(subsequence);
    }

}
