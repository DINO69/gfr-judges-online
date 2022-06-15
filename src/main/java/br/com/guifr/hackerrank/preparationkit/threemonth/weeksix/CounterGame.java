package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

public class CounterGame {

    public static String startWith(long starting) {
        if(starting == 1) return "Richard";

        int play = 1;
        String[] players = {"Louise","Richard"};

        while(starting != 1){

            if(starting == nextLowerPower(starting)){
                starting = starting / 2;
            }else{
                starting = starting - nextLowerPower(starting);
            }
            play++;
        }

        return players[play % players.length];
    }

    public static String convertToBinary(long decimal) {
        return Long.toBinaryString(decimal);
    }

    public static String justFirstDigitSignificant(String binaryNumber) {
        binaryNumber = binaryNumber.replaceAll("1", "0");
        StringBuilder sb = new StringBuilder(binaryNumber);
        sb.replace(0,1,"1");
        return sb.toString();
    }

    public static long nextLowerPower(long number) {
        String toBinary = convertToBinary(number);
        String digitSignificant = justFirstDigitSignificant(toBinary);
        return Long.valueOf(digitSignificant,2);
    }

}
