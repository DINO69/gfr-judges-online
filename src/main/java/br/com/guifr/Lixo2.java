package br.com.guifr;


import java.util.Arrays;

public class Lixo2 {

    public static void main(String[] args) {
        int soma = soma(1, 2, 3, 4, 5);
        System.out.println("Result = " + soma);
        System.out.println(soma("Result is %d when sum all values",1,2,3,4,5));
    }

    private static int soma(int ...nums) {
        return Arrays.stream(nums).reduce(0, (soma,num) ->{
//            System.out.println("soma" + soma);
//            System.out.println("num" + num);
            soma+= num;
            return soma;
        });
    }
    private static String soma(String format, int ...nums) {
        int result =  soma(nums);
        return format.formatted(result);
    }


}
