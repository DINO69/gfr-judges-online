package br.com.guifr.hackerrank.preparationkit.threemonth.weekfive;

public class StrongPassword {

    public static int validate(String s) {
        int result = 0;
        result += !hasNumber(s) ? 1 : 0;
        result += !hasLowerCase(s) ? 1 : 0;
        result += !hasUpperCase(s) ? 1 : 0;
        result += !hasSpecial(s) ? 1 : 0;
        result += missingLengthTo(s,6 - result);
        return result;
    }

    public static boolean hasNumber(String s) {
        for(int n = 0;n <= 9; n++){
            if(s.contains(String.valueOf(n))){
                return true;
            }
        }
        return false;
    }

    public static boolean hasLowerCase(String s) {
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        return leastXLettersComumBetween(s,lower_case,1);
    }

    public static boolean hasUpperCase(String s) {
        String upper_case  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return leastXLettersComumBetween(s,upper_case,1);
    }

    protected static boolean leastXLettersComumBetween(String s1,String s2, int quantityLettersComum) {
        String lessLength = s1.length() > s2.length() ? s2 : s1;
        for(String letter : lessLength.split("")){
            if(s1.contains(letter) && s2.contains(letter)){
                quantityLettersComum--;
                if(quantityLettersComum == 0){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasSpecial(String s) {
        String special_characters = "!@#$%^&*()-+";
        return leastXLettersComumBetween(s,special_characters,1);
    }

    public static int missingLengthTo(String s, int totalLength) {
        return s.length() >= totalLength ? 0 : totalLength - s.length();
    }
}
